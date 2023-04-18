package com.example.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private EditText txt_nombre, txt_contraseña;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_nombre = (EditText) findViewById(R.id.txt_nombre);
        txt_contraseña = (EditText) findViewById(R.id.txt_contraseña);
    }
    //metodo botón
    public void Registrar(View view){
        String nombre = txt_nombre.getText().toString();
        String contraseña = txt_contraseña.getText().toString();

        if (nombre.length() == 0){
            Toast.makeText(this, "Debes ingresar un nombre", Toast.LENGTH_SHORT).show();
        }
        if(contraseña.length() == 0){
            Toast.makeText(this, "Debes ingresar un nombre", Toast.LENGTH_SHORT).show();
        }
        if (nombre.length() !=0 && contraseña.length() !=0){
            Toast.makeText(this, "Te has registrado", Toast.LENGTH_SHORT).show();
        }
    }
}