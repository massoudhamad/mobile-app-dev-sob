package com.example.simplelistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    //private ListView mListView;
    //private ArrayAdapter aAdapter;

    private String[] schools = { "School of Education", "School of Natural and Social Science","School of Business","School of Health","Institute of Tourism","School of Agriculture"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView mListView = (ListView) findViewById(R.id.userlist);

        ArrayAdapter arrayAdapter  = new ArrayAdapter(this,android.R.layout.simple_list_item_1,schools);
        mListView.setAdapter(arrayAdapter);
        //aAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, users);
        //mListView.setAdapter(aAdapter);
    }
}
