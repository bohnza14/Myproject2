package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button ok = findViewById(R.id.button3);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText = findViewById(R.id.editTextTextPersonName2);
                String str = editText.getText().toString();
                Intent intent = new Intent(MainActivity2.this,MainActivity.class);
                intent.putExtra("k1", str);
                Log.i("xxx", "Send!" + str);
                startActivity(intent);
            }
        });

    }


}