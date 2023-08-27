package com.empresa;
import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Departamento> departamentos;
    private List<Oficina> oficinas;

    public Empresa() {
        departamentos = new ArrayList<>();
        oficinas = new ArrayList<>();
    }

    public void agregarDepartamento(Departamento departamento) {
        departamentos.add(departamento);
    }

    public void agregarOficina(Oficina oficina) {
        oficinas.add(oficina);
    }

    public Departamento buscarDepartamentoPorNombre(String nombre) {
        for (Departamento departamento : departamentos) {
            if (departamento.getNombre().equals(nombre)) {
                return departamento;
            }
        }
        return null;
    }

    public void eliminarDepartamento(String nombre) {
        Departamento departamento = buscarDepartamentoPorNombre(nombre);
        if (departamento != null) {
            departamentos.remove(departamento);
        }
    }

    public Oficina buscarOficinaPorNombre(String nombre) {
        for (Oficina oficina : oficinas) {
            if (oficina.getNombre().equals(nombre)) {
                return oficina;
            }
        }
        return null;
    }

    public void eliminarOficinaPorNombre(String nombre) {
        Oficina oficinaAEliminar = null;
        for (Oficina oficina : oficinas) {
            if (oficina.getNombre().equals(nombre)) {
                oficinaAEliminar = oficina;
                break;
            }
        }

        if (oficinaAEliminar != null) {
            oficinas.remove(oficinaAEliminar);
            System.out.println("Oficina eliminada: " + oficinaAEliminar);
        } else {
            System.out.println("Oficina no encontrada");
        }
    }
}