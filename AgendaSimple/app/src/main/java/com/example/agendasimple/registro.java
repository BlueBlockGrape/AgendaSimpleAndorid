package com.example.agendasimple;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class registro extends AppCompatActivity {

    private EditText txtUsuario;
    private EditText txtEmail;
    private EditText txtTwitter;
    private EditText txtTelefono;
    private EditText txtFecha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        txtUsuario = (EditText)findViewById(R.id.txtUsuario);
        txtEmail = (EditText)findViewById(R.id.txtEmail);
        txtTwitter = (EditText)findViewById(R.id.txtTwitter);
        txtTelefono = (EditText)findViewById(R.id.txtTelefono);
        txtFecha = (EditText)findViewById(R.id.txtFe);
    }

    //Metodo para el botón Guardar
    public void Guardar(View view){
        Intent i = new Intent(this, MainActivity.class);
        String User1 = txtUsuario.getText().toString();
        String Email1 = txtEmail.getText().toString();
        String Twitter1 = txtTwitter.getText().toString();
        String Telefono1 = txtTelefono.getText().toString();
        String Fecha1 = txtFecha.getText().toString();
        contacto co = new contacto(User1, Email1, Twitter1, Telefono1, Fecha1);
        i.putExtra("con", co);
        setResult(MainActivity.RESULT_OK, i);
        finish();
    }


}
