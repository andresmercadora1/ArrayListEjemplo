import com.edu.cesde.Cliente;
import com.edu.cesde.Persona;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EjemploArrayList {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        List<Cliente> clientes = new ArrayList<>();

        boolean salir = false;
        while (!salir) {
            menu();
            int opt = Integer.parseInt(inputData.nextLine());
            switch (opt) {
                case 1:
                    Cliente cliente = new Cliente();

                    System.out.println("Ingrese el ID");
                    cliente.setId(Long.parseLong(inputData.nextLine()));

                    System.out.println("Ingrese su nombre");
                    cliente.setNombre(inputData.nextLine());

                    System.out.println("Ingrese su email");
                    cliente.setEmail(inputData.nextLine());

                    System.out.println("Ingrese su celular");
                    cliente.setCelular(inputData.nextLine());

                    System.out.println("Ingrese su direccion");
                    cliente.setDireccion(inputData.nextLine());

                    clientes.add(cliente);
                    break;
                case 2:
                    for (Cliente cli : clientes) {
                        System.out.println(cli.toString());
                    }
                    break;
                case 3:
                    System.out.println("Digite el nombre del cliente que deseas eliminar");
                    String nombre = inputData.nextLine();
                    boolean flag = false;
                    for (Cliente cli1: clientes) {
                        if(cli1.getNombre().equals(nombre)) {
                            flag = true;
                            clientes.remove(cli1);
                            System.out.println("El cliente " + cli1.getNombre() + " Fue eliminado");
                            break;
                        }
                    }
                    if (!flag) {
                        System.out.println("El cliente ingresado no se existe");
                    }
                    break;
                case 4:
                    System.out.println("Digite el nombre del cliente que deseas actualizar");
                    String nombreUpdate = inputData.nextLine();
                    boolean flagUpdate = false;
                    for (Cliente cli2: clientes) {
                        if(cli2.getNombre().equals(nombreUpdate)) {
                            flagUpdate = true;
                            System.out.println("Ingrese el ID");
                            cli2.setId(Long.parseLong(inputData.nextLine()));

                            System.out.println("Ingrese su nombre");
                            cli2.setNombre(inputData.nextLine());

                            System.out.println("Ingrese su email");
                            cli2.setEmail(inputData.nextLine());

                            System.out.println("Ingrese su celular");
                            cli2.setCelular(inputData.nextLine());

                            System.out.println("Ingrese su direccion");
                            cli2.setDireccion(inputData.nextLine());

                            System.out.println("El cliente " + cli2.getNombre() + " Fue actualizado");
                            break;
                        }
                    }
                    if (!flagUpdate) {
                        System.out.println("El cliente ingresado no se actualizo");
                    }
                    break;
                case 5:
                    System.out.println("Digite el nombre del cliente que deseas buscar");
                    String nombreSearch = inputData.nextLine();
                    boolean flagSearch = false;
                    for (Cliente cli3: clientes) {
                        if(cli3.getNombre().equals(nombreSearch)) {
                            flagSearch = true;
                            System.out.println(cli3);
                            break;
                        }
                    }
                    if (!flagSearch) {
                        System.out.println("El cliente ingresado no se encontro");
                    }
                    break;
                case 6:
                    salir = true;
                    break;
            }
        }
    }

    public static void menu() {
        System.out.println(
            "==============================================================================\n" +
            "===================================  MENU  ===================================\n" +
            "===   Cliente(1=Ingresar, 2=mostrar, 3=eliminar, 4=actualizar, 5=Buscar)   ===\n" +
            "===   Empleado(6=Ingresar, 7=mostrar, 8=eliminar, 9=actualizar, 10=Buscar) ===\n" +
            "===   6=salir                                                              ===\n" +
            "==============================================================================\n");
    }
}
