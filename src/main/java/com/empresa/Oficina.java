package com.empresa;

public class Oficina {
    private String nombre;
    private boolean esOficinaCentral;

    public Oficina(String nombre, boolean esOficinaCentral) {
        this.nombre = nombre;
        this.esOficinaCentral = esOficinaCentral;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean esOficinaCentral() {
        return esOficinaCentral;
    }

    @Override
    public String toString() {
        return "Oficina{" +
                "nombre='" + nombre + '\'' +
                ", esOficinaCentral=" + esOficinaCentral +
                '}';
    }
}

