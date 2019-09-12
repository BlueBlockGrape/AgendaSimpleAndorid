package com.example.agendasimple;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private TextView lblRecibe;
    private ListView lsView;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> arrayList;
    private int z;
    private ArrayList<contacto> arr;

    private contacto contact;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lblRecibe = (TextView)findViewById(R.id.lblRecibe);
        arr= new ArrayList<>();

       // String User = getIntent().getStringExtra("User");
       // lblRecibe.setText("Hola "+User);


    }

    // Metodo para el boton agregar
    public void Agregar(View view){
        Intent i = new Intent(this, registro.class);
        startActivityForResult(i,z);
    }


    public void show(){
        //creación de variables
        lsView = (ListView) findViewById(R.id.lsView);
        arrayList = new ArrayList<String>();
        for(int i=0; i<arr.size(); i++){
            arrayList.add(arr.get(i).regresa());
        }
        adapter =  new ArrayAdapter<String>(getApplicationContext(), R.layout.custom, arrayList);
        lsView.setAdapter(adapter);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if(resultCode==MainActivity.RESULT_OK){
            contact=(contacto)data.getSerializableExtra("con");
            arr.add(contact);
            show();
        }
    }
}
