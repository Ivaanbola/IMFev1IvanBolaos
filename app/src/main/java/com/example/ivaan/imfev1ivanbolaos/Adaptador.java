package com.example.ivaan.imfev1ivanbolaos;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;


import java.util.List;

public class Adaptador extends ArrayAdapter<Tarea> {

    Context ctx;
    int layaoutTemplate;
    List<Tarea> listaTarea;

    public Adaptador(@NonNull Context context, int resource, @NonNull List<Tarea> objects) {
        super(context, resource, objects);
        this.ctx = context;
        this.layaoutTemplate = resource;
        this.listaTarea = objects;
    }


    public View getView(int position, @NonNull View convView, @NonNull ViewGroup parent) {
        View v = LayoutInflater.from(ctx).inflate(layaoutTemplate, parent, false);
        if (listaTarea.get(position) != null) {
            //Obtener la informacion del elemento de la lista que estoy iterando en el momento
            Tarea elemTareas = listaTarea.get(position);

            //Rescatar los elementos de la UI de la template
            EditText tarea = (EditText) v.findViewById(R.id.tarea);
            CheckBox prioridad = (CheckBox) v.findViewById(R.id.prioridad);
            CheckBox trabajo = (CheckBox) v.findViewById(R.id.trabajo);

            //Hacer un set de la info del elemento en los elementos de la UI
            tarea.setText(elemTareas.getTarea());
            trabajo.setChecked(elemTareas.getTrabajo());
            prioridad.setChecked(elemTareas.getPrioridad());
        }
        return v;
    }

}
