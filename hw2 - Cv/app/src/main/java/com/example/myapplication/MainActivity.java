package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView title = findViewById(R.id.title);
        TextView plzEnterUrInfo = findViewById(R.id.textView);

        EditText edtName = findViewById(R.id.edtxtName);
        EditText edtAge = findViewById(R.id.edtxtAge);
        EditText edtUrJob = findViewById(R.id.edtxtYourJob);
        EditText edtPhone = findViewById(R.id.edtxtPhoneNum);
        EditText edtEmail = findViewById(R.id.edtxtEmail);

        Button btnNext = findViewById(R.id.btnNext);
        Button btnReset = findViewById(R.id.btnReset);


        // // // // // // // // //


        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(MainActivity.this, MainActivity2.class);


                String name = (edtName.getText().toString());
                int age = Integer.parseInt( edtAge.getText().toString());
                String job = (edtUrJob.getText().toString());
                int phone = Integer.parseInt(edtPhone.getText().toString());
                String email = (edtEmail.getText().toString());






                // // // // // // // // // // // // // // //


                if (edtName.getText().toString().equals("")){


                }else if (edtAge.getText().toString().equals("")){


                }else if (edtUrJob.getText().toString().equals("")){


                }else if (edtPhone.getText().toString().equals("")){


                }else if (edtEmail.getText().toString().equals("")){



                }else{

                    CV cv = new CV(name, age,  job, phone, email );


                    intent.putExtra("name", cv.getCvName());
                    intent.putExtra("age", cv.getCvAge());
                    intent.putExtra("job", cv.getCvJob());
                    intent.putExtra("phone", cv.getCvPhone());
                    intent.putExtra("email", cv.getCvEmail());

                    startActivity(intent);
                }

            }
        });


        // // // // // // // // // // // // // //


        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                edtName.getText().clear();
                edtAge.getText().clear();
                edtUrJob.getText().clear();
                edtPhone.getText().clear();
                edtEmail.getText().clear();

            }
        });





    }
}