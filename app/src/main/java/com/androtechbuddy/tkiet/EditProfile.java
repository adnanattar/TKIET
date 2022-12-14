package com.androtechbuddy.tkiet;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;
import com.squareup.picasso.Picasso;

import java.util.HashMap;
import java.util.Map;

public class EditProfile extends AppCompatActivity {

    public static final String TAG = "TAG";
    EditText profileFullName,profileEmail,profilePhone,profileDivision,profileRollNumber,profileState,profileCity,profileDepartment,profileYear;
    ImageView profileImageView;
    Button saveBtn;
    FirebaseAuth fAuth;
    FirebaseFirestore fStore;
    FirebaseUser user;
    StorageReference storageReference;

    private View parent_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        parent_view = findViewById(android.R.id.content);

        Intent data = getIntent();
        final String fullName = data.getStringExtra("fullName");
        String email = data.getStringExtra("email");
        String phone = data.getStringExtra("phone");

        final String division = data.getStringExtra("division");
        final  String roll_number = data.getStringExtra("roll");
        final String state = data.getStringExtra("state");
        final  String city = data.getStringExtra("city");
        final  String department = data.getStringExtra("department");
        final  String learning_year = data.getStringExtra("year");

        fAuth = FirebaseAuth.getInstance();
        fStore = FirebaseFirestore.getInstance();
        user = fAuth.getCurrentUser();
        storageReference = FirebaseStorage.getInstance().getReference();

        profileFullName = findViewById(R.id.profileFullName);
        profileEmail = findViewById(R.id.profileEmailAddress);
        profilePhone = findViewById(R.id.profilePhoneNo);
        profileImageView = findViewById(R.id.profileImageView);
        saveBtn = findViewById(R.id.saveProfileInfo);

        profileDivision = findViewById(R.id.division);
        profileRollNumber = findViewById(R.id.roll_number);
        profileState = findViewById(R.id.state);
        profileCity = findViewById(R.id.city);
        profileDepartment = findViewById(R.id.department);
        profileYear= findViewById(R.id.year);

        StorageReference profileRef = storageReference.child("users/"+fAuth.getCurrentUser().getUid()+"/profile.jpg");
        profileRef.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                Picasso.get().load(uri).into(profileImageView);
            }
        });

        profileImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openGalleryIntent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(openGalleryIntent,1000);
            }
        });

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(profileFullName.getText().toString().isEmpty() || profileEmail.getText().toString().isEmpty() || profilePhone.getText().toString().isEmpty() || profileDivision.getText().toString().isEmpty() || profileRollNumber.getText().toString().isEmpty() || profileState.getText().toString().isEmpty() || profileCity.getText().toString().isEmpty() || profileDepartment.getText().toString().isEmpty() || profileYear.getText().toString().isEmpty()){
                    Snackbar.make(parent_view, "One or many fields are empty.", Snackbar.LENGTH_SHORT).show();

                    return;
                }

                final String email = profileEmail.getText().toString();
                user.updateEmail(email).addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        DocumentReference docRef = fStore.collection("users").document(user.getUid());
                        Map<String,Object> edited = new HashMap<>();
                        edited.put("email",email);
                        edited.put("fName",profileFullName.getText().toString());
                        edited.put("phone",profilePhone.getText().toString());

                        edited.put("division",profileDivision.getText().toString());
                        edited.put("roll",profileRollNumber.getText().toString());
                        edited.put("state",profileState.getText().toString());
                        edited.put("city",profileCity.getText().toString());
                        edited.put("department",profileDepartment.getText().toString());
                        edited.put("year",profileYear.getText().toString());

                        docRef.update(edited).addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void aVoid) {
                               //Toast.makeText(EditProfile.this, "Profile Image Updated", Toast.LENGTH_SHORT).show();
//                                startActivity(new Intent(getApplicationContext(),my_account.class));
//                                finish();
                            }
                        });
                        Snackbar.make(parent_view, "Profile Data Updated Successfully", Snackbar.LENGTH_SHORT).show();
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(EditProfile.this,   e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });


            }
        });

        profileEmail.setText(email);
        profileFullName.setText(fullName);
        profilePhone.setText(phone);

        profileDivision.setText(division);
        profileRollNumber.setText(roll_number);
        profileState.setText(state);
        profileCity.setText(city);
        profileDepartment.setText(department);
        profileYear.setText(learning_year);

        Log.d(TAG, "onCreate: " + fullName + " " + email + " " + phone+ " " + roll_number+ " " + state+ " " + city+ " " + department+ " " + learning_year);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @androidx.annotation.Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1000){
            if(resultCode == Activity.RESULT_OK){
                Uri imageUri = data.getData();

                //profileImage.setImageURI(imageUri);

                uploadImageToFirebase(imageUri);


            }
        }

    }

    private void uploadImageToFirebase(Uri imageUri) {
        // uplaod image to firebase storage
        final StorageReference fileRef = storageReference.child("users/"+fAuth.getCurrentUser().getUid()+"/profile.jpg");
        fileRef.putFile(imageUri).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
            @Override
            public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                fileRef.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {
                        Picasso.get().load(uri).into(profileImageView);
                    }
                });
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(getApplicationContext(), "Failed.", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
