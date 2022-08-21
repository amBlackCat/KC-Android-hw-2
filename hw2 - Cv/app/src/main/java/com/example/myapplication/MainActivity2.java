package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageView imgCV = findViewById(R.id.img);
        TextView yourCV = findViewById(R.id.txtVuYourCv);
        Button btnBack = findViewById(R.id.btnBack);

        TextView name = findViewById(R.id.txtVuName);
        TextView nameVu = findViewById(R.id.nameView);

        TextView age = findViewById(R.id.txtVuAge);
        TextView ageVu= findViewById(R.id.ageView);

        TextView job= findViewById(R.id.txtVuYourJob);
        TextView jobVu= findViewById(R.id.jobview);

        TextView phone= findViewById(R.id.txtVuPhoneNumber);
        TextView phoneVu= findViewById(R.id.phoneView);

        TextView email = findViewById(R.id.txtVuEmail);
        TextView emailVu = findViewById(R.id.emailView);


        // // // // // // // // // // // //


        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent2 = new Intent(MainActivity2.this, MainActivity.class);

                startActivity(intent2);

            }
        });


        // // // // // // // // // // // //


        Bundle bundle = getIntent().getExtras();

        String nameString = bundle.getString("name");
        nameVu.setText(String.valueOf(nameString));


        int ageString = bundle.getInt("age");
        ageVu.setText(String.valueOf(ageString));


        String jobString = bundle.getString("job");
        jobVu.setText(String.valueOf(jobString));


        int phoneString = bundle.getInt("phone");
        phoneVu.setText(String.valueOf(phoneString));


        String emailString = bundle.getString("email");
        emailVu.setText(String.valueOf(emailString));




    }
}