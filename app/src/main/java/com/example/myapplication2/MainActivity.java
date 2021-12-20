package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String num1 = getIntent().getStringExtra("k1");
        Log.i("xxx", "receive! " + num1);
        textView = findViewById(R.id.textView1);
        textView.setText(num1);
    }
    private  TextView textView;


    public void numClk(View view){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    public void strClk(View view){
        EditText editText = findViewById(R.id.editTextTextPersonName);
        String str = editText.getText().toString();
        Intent intent = new Intent(this, MainActivity3.class);
        intent.putExtra("k2", str);
        Log.i("xxx", "Send!" + str);
        startActivity(intent);
    }
}