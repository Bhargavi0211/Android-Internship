package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.view.View;

import java.lang.reflect.Array;


public class MainActivity extends AppCompatActivity {

    ListView listview;
    String[] course={"PHP","ANDROID","IOS","C","IONIC","ANGULAR","WORDPRESS","JAVA","#C","HTML",
            "FIREBASE","C++","NODE"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview = findViewById(R.id.list);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>
                (MainActivity.this, android.R.layout.simple_list_item_1,course);
        listview.setAdapter(adapter);

        //Click Event of listview

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "clicked" + course[position], Toast.LENGTH_SHORT).show();
                //Toast.makeText(getApplicationContext(), "clicked" + course[position], Toast.LENGTH_SHORT).show();
            }
        });






    }
}