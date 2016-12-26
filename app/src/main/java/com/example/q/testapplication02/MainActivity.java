package com.example.q.testapplication02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listview;
        ContactAdapter adapter;

        adapter = new ContactAdapter();

        listview = (ListView) findViewById(R.id.listview1);
        listview.setAdapter(adapter);

        for (int i=0 ; i<10 ; i++) {
            adapter.addItem("Test Name", "010-0000-0000");
            adapter.addItem("Hello World", "010-1234-5678");
            adapter.addItem("Who is it", "010-3453-2342");
        }

    }
}
