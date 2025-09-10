package com.upiiz.ejercicio03.models;

public class Mascota {
    private int id;
    private String nombre;
    private String observaciones;
    private int edad;

    public Mascota() {

    }

    public Mascota(int id, String nombre, String observaciones, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.observaciones = observaciones;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}


