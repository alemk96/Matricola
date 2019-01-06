package com.example.matricola;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        MyModel m = MyModel.getMyModel();

        ArrayList<String> result=new ArrayList<String>();
        result=m.getElenco();

        ListView output=(ListView) findViewById(R.id.lista);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, result);
        output.setAdapter(myAdapter);
    }


}
