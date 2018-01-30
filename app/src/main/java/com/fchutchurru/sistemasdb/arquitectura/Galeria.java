package com.fchutchurru.sistemasdb.arquitectura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Galeria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeria);
        Log.i("creado","se ejecutó el método onCreate() en actividad Galeria");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("inicio","se ejecutó el método onStart() en actividad Galeria");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("resumido","se ejecutó el método onResume() en actividad Galeria");
    }
}
