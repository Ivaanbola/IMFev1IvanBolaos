package com.example.ivaan.imfev1ivanbolaos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;

public class formulario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
    }

    public void enviar(View view) {
        ArrayList<Tarea> array = new ArrayList<>();


        CheckBox trabajo = (CheckBox) findViewById(R.id.trabajo1);
        Boolean trabajotext = trabajo.isChecked();
        CheckBox prioridad = (CheckBox) findViewById(R.id.prioridad1);
        Boolean prioridadtext = prioridad.isChecked();
        EditText tarea = (EditText) findViewById(R.id.tarea1);
        String tareatext = tarea.getText().toString();
        Tarea tareaobj = new Tarea(tareatext, prioridadtext, trabajotext);
        array.add(tareaobj);


        CheckBox trabajo1 = (CheckBox) findViewById(R.id.trabajo2);
        Boolean trabajotext1 = trabajo1.isChecked();
        CheckBox prioridad1 = (CheckBox) findViewById(R.id.prioridad2);
        Boolean prioridadtext1 = prioridad1.isChecked();
        EditText tarea1 = (EditText) findViewById(R.id.tarea2);
        String tareatext1 = tarea1.getText().toString();
        Tarea tareaobj1 = new Tarea(tareatext1, prioridadtext1, trabajotext1);
        array.add(tareaobj1);

        CheckBox trabajo2 = (CheckBox) findViewById(R.id.trabajo3);
        Boolean trabajotext2 = trabajo2.isChecked();
        CheckBox prioridad2 = (CheckBox) findViewById(R.id.prioridad3);
        Boolean prioridadtext2 = prioridad2.isChecked();
        EditText tarea2 = (EditText) findViewById(R.id.tarea3);
        String tareatext2 = tarea2.getText().toString();
        Tarea tareaobj2 = new Tarea(tareatext2, prioridadtext2, trabajotext2);
        array.add(tareaobj2);

        CheckBox trabajo3 = (CheckBox) findViewById(R.id.trabajo4);
        Boolean trabajotext3 = trabajo3.isChecked();
        CheckBox prioridad3 = (CheckBox) findViewById(R.id.prioridad4);
        Boolean prioridadtext3 = prioridad3.isChecked();
        EditText tarea3 = (EditText) findViewById(R.id.tarea4);
        String tareatext3 = tarea3.getText().toString();
        Tarea tareaobj3 = new Tarea(tareatext3, prioridadtext3, trabajotext3);
        array.add(tareaobj3);

        CheckBox trabajo4 = (CheckBox) findViewById(R.id.trabajo5);
        Boolean trabajotext4 = trabajo4.isChecked();
        CheckBox prioridad4 = (CheckBox) findViewById(R.id.prioridad5);
        Boolean prioridadtext4 = prioridad4.isChecked();
        EditText tarea4 = (EditText) findViewById(R.id.tarea5);
        String tareatext4 = tarea4.getText().toString();
        Tarea tareaobj4 = new Tarea(tareatext4, prioridadtext4, trabajotext4);
        array.add(tareaobj4);


        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        intent.putExtra("array", array);

        startActivity(intent);


    }


}
