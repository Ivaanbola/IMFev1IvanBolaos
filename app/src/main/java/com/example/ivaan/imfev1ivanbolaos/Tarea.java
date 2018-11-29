package com.example.ivaan.imfev1ivanbolaos;


import java.io.Serializable;

public class Tarea   implements Serializable {
    private String tarea;
    private boolean prioridad;
    private boolean trabajo;


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

    public boolean isPrioridad() {
        return prioridad;
    }

    public void setPrioridad(boolean prioridad) {
        this.prioridad = prioridad;
    }

    public boolean isTrabajo() {
        return trabajo;
    }

    public void setTrabajo(boolean trabajo) {
        this.trabajo = trabajo;
    }
}
