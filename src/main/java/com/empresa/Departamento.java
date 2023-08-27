package com.empresa;
import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nombre;
    private Empleado administrador;
    private List<Empleado> empleados;

    public Departamento(String nombre, Empleado administrador) {
        this.nombre = nombre;
        this.administrador = administrador;
        this.empleados = new ArrayList<>();
        empleados.add(administrador);
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public String getNombre() {
        return nombre;
    }

    public Empleado getAdministrador() {
        return administrador;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public List<String> getNombresEmpleados() {
        List<String> nombres = new ArrayList<>();
        for (Empleado empleado : empleados) {
            nombres.add(empleado.getNombre());
        }
        return nombres;
    }

    @Override
    public String toString() {
        List<String> nombresEmpleados = getNombresEmpleados();
        StringBuilder empleadoStr = new StringBuilder();
        for (int i = 0; i < nombresEmpleados.size(); i++) {
            String nombre = nombresEmpleados.get(i);
            empleadoStr.append(nombre);
            empleadoStr.append(" (");
            empleadoStr.append(empleados.get(i).getCargo());
            empleadoStr.append(")");
            if (i != nombresEmpleados.size() - 1) {
                empleadoStr.append(", ");
            }
        }

        String adminCargo = administrador.esAdministrador() ? "si" : "no";

        return "Departamento{" +
                "nombre='" + nombre + '\'' +
                ", empleado='" + empleadoStr.toString() + '\'' +
                ", administrador='" + adminCargo + '\'' +
                ", cargo='" + administrador.getCargo() + '\'' +
                '}';
    }
}
