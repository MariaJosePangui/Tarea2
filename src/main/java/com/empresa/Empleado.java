package com.empresa;
class Empleado {
    private String nombre;
    private boolean esAdministrador;
    private String cargo;

    public Empleado(String nombre, boolean esAdministrador, String cargo) {
        this.nombre = nombre;
        this.esAdministrador = esAdministrador;
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean esAdministrador() {
        return esAdministrador;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", esAdministrador=" + esAdministrador +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
