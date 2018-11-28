package com.example.ivaan.imfev1ivanbolaos;

import java.io.Serializable;

public class Tarea implements Serializable {
    private String tarea;
    private Boolean prioridad;
    private Boolean trabajo;


    public Tarea(){

    }

    public Tarea(String tarea, Boolean prioridad, Boolean trabajo) {
        this.tarea = tarea;
        this.prioridad = prioridad;
        this.trabajo = trabajo;
    }

    public String getTarea() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }

    public Boolean getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Boolean prioridad) {
        this.prioridad = prioridad;
    }

    public Boolean getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(Boolean trabajo) {
        this.trabajo = trabajo;
    }
}
