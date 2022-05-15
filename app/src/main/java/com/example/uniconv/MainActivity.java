package com.example.uniconv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView4;
    private EditText editTextTextPersonName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView4 = findViewById(R.id.textView4);
        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Button Worked Sucessfully", Toast.LENGTH_SHORT).show();
                String s = editTextTextPersonName.getText().toString();
                double kg = Double.parseDouble(s);
                double pound = 2.205 * kg;
                textView4.setText(" The corresponding Pounds value is: " + pound);


            }
        });

    }
}
