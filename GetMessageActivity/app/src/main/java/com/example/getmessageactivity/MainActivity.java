package com.example.getmessageactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.testintent.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        Toast.makeText(this,"Welcome to SoB SUZA 2020",Toast.LENGTH_LONG).show();
// Create an Intent to start the second activity
        /*Intent intent = new Intent(getApplicationContext(),DetailMessageActivity.class);
        EditText txtMessage = (EditText)findViewById(R.id.txtMessageID);
        String message = txtMessage.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,message);
        startActivity(intent);*/
        /*Implicit Intent*/
        /*Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.suza.ac.tz"));
        startActivity(intent);*/
    }
}
