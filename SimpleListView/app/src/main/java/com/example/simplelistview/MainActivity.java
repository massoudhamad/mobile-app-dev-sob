package com.example.simplelistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView mListView;
    private ArrayAdapter adaper;

    private String[] schools = {
            "School of Education",
            "School of Natural and Social Science",
            "School of Business",
            "School of Health",
            "Institute of Tourism",
            "School of Agriculture",
            "School of Computing Communication and Media Studies",
            "School of Benbella",
            "School of Chwaka",
            "School of Kwantipura"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.userlist);

        adaper = new ArrayAdapter(this, android.R.layout.simple_list_item_1,schools);
        mListView.setAdapter(adaper);
        //aAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, users);
        //mListView.setAdapter(aAdapter)

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                Toast.makeText(getApplicationContext(),
                        "Click ListItem Number " + position, Toast.LENGTH_SHORT)
                        .show();

            }
        });
    }

}
