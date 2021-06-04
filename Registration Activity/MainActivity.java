package com.example.activity_main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnclick;
    EditText etname,etpw,etemail,etgender,etno,ethobby;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnclick=findViewById(R.id.btnclick);
        etname=findViewById(R.id.etname);
        etemail=findViewById(R.id.etemail);
        etpw=findViewById(R.id.etpw);
        etgender=findViewById(R.id.etgender);
        etno=findViewById(R.id.etno);
        ethobby=findViewById(R.id.ethobby);

        btnclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = etname.getText().toString();
                Intent intent=new Intent(MainActivity.this,DataActivity.class);
                intent.putExtra("NAME",name);

                String email = etemail.getText().toString();
                intent.putExtra("EMAIL",email);

                String pw = etpw.getText().toString();
                intent.putExtra("PASSWORD",pw);

                String gender = etgender.getText().toString();
                intent.putExtra("GENDER",gender);

                String no = etno.getText().toString();
                intent.putExtra("NO",no);

                String hobby = ethobby.getText().toString();
                intent.putExtra("HOBBY",hobby);


                startActivity(intent);
            }
        });


    }
}