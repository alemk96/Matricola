package com.example.matricola;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
    }
     public void cerca(View view){
         String testo= ((EditText)findViewById(R.id.cerca)).getText().toString();
         //se è un codice vuol dire che cerco in base alla matricola altrimenti in base al nome/cognome
         MyModel m = MyModel.getMyModel();
         ArrayList<String> result=new ArrayList<String>();
         result=m.FromTesto(testo);
        ListView output=(ListView) findViewById(R.id.textView);
         ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, result);
         output.setAdapter(myAdapter);

     }

}
