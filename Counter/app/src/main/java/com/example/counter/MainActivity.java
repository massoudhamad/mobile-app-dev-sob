package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private TextView textID;
private RadioButton rUpId,rDownId;
private Button btnId;
private int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textID = (TextView)findViewById(R.id.txtCountId);
        rUpId = (RadioButton)findViewById(R.id.rBtnUpId);
        rDownId=(RadioButton)findViewById(R.id.rBtnDownId);
        btnId=(Button)findViewById(R.id.btnCountId);
        textID.setText(String.valueOf(count));

        btnId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rUpId.isChecked()) {
                    count++;
                }
                else if(rDownId.isChecked()) {
                    count--;
                }
                textID.setText(String.valueOf(count));
            }
        });

    }
}
