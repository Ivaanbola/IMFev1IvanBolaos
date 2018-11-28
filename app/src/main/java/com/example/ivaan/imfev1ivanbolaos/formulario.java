package com.example.ivaan.imfev1ivanbolaos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class formulario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
    }

    public void enviar(View view){


        EditText tarea = (EditText) findViewById(R.id.tarea);
        String tareatext = tarea.getText().toString();
        CheckBox prioridad = (CheckBox) findViewById(R.id.prioridad);
        Boolean prioridadtext = prioridad.isChecked();
        CheckBox trabajo = (CheckBox) findViewById(R.id.trabajo);
        Boolean trabajotext = trabajo.isChecked();

        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        intent.putExtra("tarea",tareatext);
        intent.putExtra("prioridad", prioridadtext);
        intent.putExtra("trabajo", trabajotext);

        startActivity(intent);


    }


}
