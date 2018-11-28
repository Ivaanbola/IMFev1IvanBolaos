package com.example.ivaan.imfev1ivanbolaos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Tarea> listatareas;
    private ListView tareas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tareas = (ListView) findViewById(R.id.tareas);
        listatareas = new ArrayList<Tarea>();

        if (getIntent().getStringExtra("array") != null) {

            listatareas = (ArrayList<Tarea>) getIntent().getSerializableExtra("array");

            Adaptador adaptador = new Adaptador(this,
                    R.layout.activity_tareas_item,
                    listatareas
            );
            tareas.setAdapter(adaptador);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.insertar:
                formulario();
                return true;
            case R.id.ayuda:
                contenido();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void formulario() {
        //Toast.makeText(this, "Has hecho click en el boton", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(getApplicationContext(), formulario.class);
        startActivity(intent);
    }

    public void contenido() {
        //Toast.makeText(this, "Has hecho click en el boton", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(getApplicationContext(), contenido.class);
        startActivity(intent);
    }

}
