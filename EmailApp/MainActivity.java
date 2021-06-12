package com.example.emailapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etTO, eTSubject , eTMessage;
    Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etTO =(EditText) findViewById(R.id.editText1_email1);
        eTSubject =(EditText) findViewById(R.id.editText2_subject);
        eTMessage =(EditText) findViewById(R.id.editText3_message);
        btnSend=(Button) findViewById(R.id.btnSend);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String to= etTO.getText().toString();
                String Subject= eTSubject.getText().toString();
                String message= eTMessage.getText().toString();

                // Use implicit intent
                //Use ACTION_SEND action to launch an email client installed on Your Android device.
                Intent intent= new Intent(Intent.ACTION_SEND);

                //We have to use PutExtra() method of Intent to put data on email client to send an email.
                //Intent.EXTRA_EMAIL is a string() array that holding e-mail addresses that should be delivered to.
                intent.putExtra(Intent.EXTRA_EMAIL,new String[] {to});

                //Intent.EXTRA_SUBJECT contains subject of email.
                intent.putExtra(Intent.EXTRA_SUBJECT,Subject);

                //Intent.EXTRA_TEXT contains text for email.
                intent.putExtra(Intent.EXTRA_TEXT, message);

                //Add below line to prompt email client only.
                intent.setType("message/rfc822");

                //Intent.createChooser() method is used to choose email client.
                startActivity(Intent.createChooser(intent,"send email:"));
            }
        });


    }
}