package com.empresa;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empresa empresa = new Empresa();

        while (true) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Agregar departamento");
            System.out.println("2. Agregar oficina");
            System.out.println("3. Buscar departamento por nombre");
            System.out.println("4. Eliminar departamento por nombre");
            System.out.println("5. Buscar oficina por nombre");
            System.out.println("6. Eliminar oficina por nombre");
            System.out.println("7. Salir");
            System.out.print("Elija una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del departamento: ");
                    String nombreDepartamento = scanner.nextLine();
                    System.out.print("Ingrese el nombre del empleado: ");
                    String nombreEmpleado = scanner.nextLine();
                    System.out.print("El empleado es administrador (true/false): ");
                    boolean esAdministrador = scanner.nextBoolean();
                    scanner.nextLine();

                    String cargoEmpleado = "";
                    if (!esAdministrador) {
                        System.out.print("Ingrese el cargo del empleado: ");
                        cargoEmpleado = scanner.nextLine();
                    }

                    Empleado empleado = new Empleado(nombreEmpleado, esAdministrador, cargoEmpleado);
                    Departamento depto = new Departamento(nombreDepartamento, empleado);
                    empresa.agregarDepartamento(depto);

                    break;
                case 2:
                    System.out.print("Ingrese el nombre de la oficina: ");
                    String nombreOficina = scanner.nextLine();
                    System.out.print("¿Es una oficina central? (true/false): ");
                    boolean esOficinaCentral = scanner.nextBoolean();
                    if (esOficinaCentral) {
                        OficinaCentral oficinaCentral = new OficinaCentral(nombreOficina);
                        empresa.agregarOficina(oficinaCentral);
                    } else {
                        Oficina oficina = new Oficina(nombreOficina, false);
                        empresa.agregarOficina(oficina);
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del departamento a buscar: ");
                    String nombreBusqueda = scanner.nextLine();
                    Departamento deptoEncontrado = empresa.buscarDepartamentoPorNombre(nombreBusqueda);
                    if (deptoEncontrado != null) {
                        System.out.println("Departamento encontrado: " + deptoEncontrado);
                    } else {
                        System.out.println("Departamento no encontrado");
                    }
                    break;
                case 4:
                    System.out.print("Ingrese el nombre del departamento a eliminar: ");
                    String nombreEliminacion = scanner.nextLine();
                    empresa.eliminarDepartamento(nombreEliminacion);
                    break;
                case 5:
                    System.out.print("Ingrese el nombre de la oficina a buscar: ");
                    nombreBusqueda = scanner.nextLine(); // Aquí, reutiliza la variable ya definida
                    Oficina oficinaEncontrada = empresa.buscarOficinaPorNombre(nombreBusqueda);
                    if (oficinaEncontrada != null) {
                        System.out.println("Oficina encontrada: " + oficinaEncontrada);
                    } else {
                        System.out.println("Oficina no encontrada");
                    }
                    break;
                case 6:
                    System.out.print("Ingrese el nombre de la oficina a eliminar: ");
                    String nombreEliminacionOficina = scanner.nextLine();
                    empresa.eliminarOficinaPorNombre(nombreEliminacionOficina);
                    break;
                case 7:
                    System.out.println("Saliendo del programa");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción inválida. Por favor, elija una opción válida.");
            }
        }
    }
}