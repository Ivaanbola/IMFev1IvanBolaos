package com.example.ivaan.imfev1ivanbolaos;

import android.content.Context;
import android.media.Image;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class Adaptador extends ArrayAdapter<Tarea> {

    Context ctx;
    int layaoutTemplate;
    ArrayList<Tarea> listaTarea;

    public Adaptador(@NonNull Context context, int resource, @NonNull ArrayList<Tarea> objects) {
        super(context, resource, objects);
        this.ctx = context;
        this.layaoutTemplate = resource;
        this.listaTarea = objects;
    }


    public View getView(int position, @NonNull View convView, @NonNull ViewGroup parent) {
        View v = LayoutInflater.from(ctx).inflate(layaoutTemplate, parent, false);

        //Obtener la informacion del elemento de la lista que estoy iterando en el momento
        Tarea elemTareas = listaTarea.get(position);

        //Rescatar los elementos de la UI de la template
        TextView tarea = (TextView) v.findViewById(R.id.texttarea);
        ImageView prioridad = (ImageView) v.findViewById(R.id.checkPrioridad);
        ImageView trabajo = (ImageView) v.findViewById(R.id.checkTarea);

        //Hacer un set de la info del elemento en los elementos de la UI
        tarea.setText(elemTareas.getTarea());
        if (elemTareas.isPrioridad()) {
            prioridad.setImageResource(R.drawable.prioridad);
        } else prioridad.setImageResource(R.drawable.noprioridad);
        if (elemTareas.isTrabajo()) {
            trabajo.setImageResource(R.drawable.trabajo);
        } else trabajo.setImageResource(R.drawable.notrabajo);

        final ImageView imagen = (ImageView) v.findViewById(R.id.terminada);
        imagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imagen.setImageResource(R.drawable.hecha);
            }
        });

        return v;
    }


}
