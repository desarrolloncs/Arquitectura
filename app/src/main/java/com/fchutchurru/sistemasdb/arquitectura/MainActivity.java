package com.fchutchurru.sistemasdb.arquitectura;

import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("creado","se ejecutó el método onCreate() en actividad Main (Login)");
    }

    public void notificar(View view){

        Snackbar snackbar= Snackbar.make(view,"Debes Recuperar tu cuenta",Snackbar.LENGTH_LONG)
                .setAction("Recuperar", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Toast.makeText(MainActivity.this,"Se ha enviado ingformacion de recuperacion a su cuenta de Email", Toast.LENGTH_LONG).show();
                    }
                });
        snackbar.setActionTextColor(Color.GREEN);
        View snackBarView = snackbar.getView();
        snackBarView.setBackgroundColor(Color.BLUE);
        snackbar.show();

    }

    public void validar(View view){

        EditText etUsuario = (EditText) findViewById(R.id.usuario);
        EditText etContraseña = (EditText) findViewById(R.id.contraseña);

        if((etUsuario.getText().toString().isEmpty() && etContraseña.getText().toString().isEmpty())
                || (etUsuario.getText().toString().isEmpty() && (etContraseña.getText().toString().length() >0))
                ||  (etContraseña.getText().toString().isEmpty() && (etUsuario.getText().toString().length() >0))){
            Toast toast =
                    Toast.makeText(getApplicationContext(),
                            "Debes ingresar ambos datos de usuario", Toast.LENGTH_SHORT);

            toast.show();
        }
        else {
            Intent intent = new Intent(getApplicationContext(), Galeria.class);
            startActivity(intent);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("inicio","se ejecutó el método onStart() en actividad Main (Login)");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("resumido","se ejecutó el método onResume() en actividad Main (Login)");
    }
}
