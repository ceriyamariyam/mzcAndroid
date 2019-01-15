package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class calculator extends AppCompatActivity {
    EditText ed1,ed2;
    Button b;
    String s1,s2,s3;
    int x,y,z;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        b=(Button)findViewById(R.id.button);
    ed1=(EditText)findViewById(R.id.one);
        ed2=(EditText)findViewById(R.id.two);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=ed1.getText().toString();
                s2=ed2.getText().toString();
                x=Integer.parseInt(s1);
                y=Integer.parseInt(s2);
                z=x+y;
                s3=String.valueOf(z);
                Toast.makeText(getApplicationContext(),s3,Toast.LENGTH_LONG).show();

            }
        });
    }
}
