package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    String Course[]={"PHP","ANDROID","IOS","C","IONIC","ANGULAR","WORDPRESS","JAVA","#C","HTML",
            "FIREBASE","C++","NODE"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView=findViewById(R.id.tv1);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,Course);
        gridView.setAdapter(arrayAdapter);

    }
}