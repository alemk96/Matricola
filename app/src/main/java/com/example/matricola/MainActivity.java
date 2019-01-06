package com.example.matricola;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void aggiungi(View v) {
      Intent intent=new Intent(MainActivity.this,AddActivity.class);//creo l'intent per collegare la classe NuovaMatricola
        startActivity(intent);

    }

    public void cerca(View view) {
        Intent intent=new Intent(MainActivity.this,SearchActivity.class);
        startActivity(intent);//creo l'intent per collegare la classe NuovaMatricola
    }
    public void elenco(View view) {
        Intent intent=new Intent(MainActivity.this,DisplayActivity.class);
        startActivity(intent);//creo l'intent per collegare la classe NuovaMatricola
    }

    public void show(View view) {
        Log.d("Mostra import", "server");
        Intent i= new Intent();

        }
    }





