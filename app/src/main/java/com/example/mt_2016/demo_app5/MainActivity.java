package com.example.mt_2016.demo_app5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
   // TextView textView= (TextView) findViewById()




    public void showMap(String geoLocation) {

        EditText x=(EditText)findViewById(R.id.xais);
        EditText y=(EditText)findViewById(R.id.yaxis);

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:0,0?q=1600+Amphitheatre+Parkway%2C+CA"+x));
        intent.setData(Uri.parse("geo:0,0?q=1600+Amphitheatre+Parkway%2C+CA"+y));

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
