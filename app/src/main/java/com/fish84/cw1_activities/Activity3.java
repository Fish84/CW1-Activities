package com.fish84.cw1_activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {

    EditText message3;
    Button button3;
    TextView view3;
    String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        message3 =findViewById(R.id.textBox3);
        button3=findViewById(R.id.button3);
        view3=findViewById(R.id.messageView3);

        Intent intent=getIntent();
        String text3 =intent.getStringExtra("show");
        view3.setText(text3);

        button3.setOnClickListener((v)-> {
            String text = message3.getText().toString();
            String t = view3.getText().toString();
            message = t+ "\n"+text;

            Intent intent3= new Intent(Activity3.this,Activity4.class);
            intent3.putExtra("show",message);
            startActivity(intent3);
        });
    }
}