package com.example.dheo.SubmissionRecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
// TODO 6.0 Membuat Class Profile Activity
    public class ProfileActivity extends AppCompatActivity {
//TODO 6.2  Deklarasi Variable di class ProfileActivity
        TextView tvProfileName;
        TextView tvProfileEmail;
        ImageView ivProfilePhoto;
//TODO 6.1 Membuat metode onCreate
// TODO 6.3 Constructor Matching Super
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        //TODO 6.5 Mengganti Nama tampilan Actiobar posisi yang atas
        getSupportActionBar().setTitle(getString(R.string.ProfileUser));

        // TODO 6.4 inisialisasi / hub dengan id nya masing-masing
        tvProfileName = findViewById(R.id.tv_profile_name);
        tvProfileEmail = findViewById(R.id.tv_profile_email);
        ivProfilePhoto = findViewById(R.id.profile_photo);

        Glide.with(getApplicationContext())
                .load(R.drawable.poto_1)
                .into(ivProfilePhoto);

        }
    }
