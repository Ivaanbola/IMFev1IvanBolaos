package com.example.ivaan.imfev1ivanbolaos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class formulario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
    }

    public void enviar(View view) {


        EditText tarea = (EditText) findViewById(R.id.tarea1);
        String tareatext = tarea.getText().toString();
        CheckBox prioridad = (CheckBox) findViewById(R.id.prioridad1);
        Boolean prioridadtext = prioridad.isChecked();
        CheckBox trabajo = (CheckBox) findViewById(R.id.trabajo1);
        Boolean trabajotext = trabajo.isChecked();
        Tarea tareaobj = new Tarea(tareatext, prioridadtext, trabajotext);
        ArrayList<Tarea> array = new ArrayList<>();
        array.add(tareaobj);
        trabajo = (CheckBox) findViewById(R.id.trabajo2);
        trabajotext = trabajo.isChecked();
        prioridad = (CheckBox) findViewById(R.id.prioridad2);
        prioridadtext = prioridad.isChecked();
        tarea = (EditText) findViewById(R.id.tarea2);
        tareatext = tarea.getText().toString();
        tareaobj = new Tarea(tareatext, prioridadtext, trabajotext);
        array.add(tareaobj);
        trabajo = (CheckBox) findViewById(R.id.trabajo3);
        trabajotext = trabajo.isChecked();
        prioridad = (CheckBox) findViewById(R.id.prioridad3);
        prioridadtext = prioridad.isChecked();
        tarea = (EditText) findViewById(R.id.tarea3);
        tareatext = tarea.getText().toString();
        tareaobj = new Tarea(tareatext, prioridadtext, trabajotext);
        array.add(tareaobj);
        trabajo = (CheckBox) findViewById(R.id.trabajo4);
        trabajotext = trabajo.isChecked();
        prioridad = (CheckBox) findViewById(R.id.prioridad4);
        prioridadtext = prioridad.isChecked();
        tarea = (EditText) findViewById(R.id.tarea4);
        tareatext = tarea.getText().toString();
        tareaobj = new Tarea(tareatext, prioridadtext, trabajotext);
        array.add(tareaobj);
        trabajo = (CheckBox) findViewById(R.id.trabajo5);
        trabajotext = trabajo.isChecked();
        prioridad = (CheckBox) findViewById(R.id.prioridad5);
        prioridadtext = prioridad.isChecked();
        tarea = (EditText) findViewById(R.id.tarea5);
        tareatext = tarea.getText().toString();
        tareaobj = new Tarea(tareatext, prioridadtext, trabajotext);
        array.add(tareaobj);

        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        intent.putExtra("array", array);

        startActivity(intent);


    }


}
