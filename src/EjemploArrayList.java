import com.edu.cesde.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EjemploArrayList {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        List<Usuario> usuarioList = new ArrayList<>();

        boolean salir = false;
        while (!salir) {
            menu();
            int opt = Integer.parseInt(inputData.nextLine());
            switch (opt) {
                case 1:
                    Usuario usuario = new Usuario();

                    System.out.println("Ingrese el ID");
                    usuario.setId(Long.parseLong(inputData.nextLine()));

                    System.out.println("Ingrese su nombre");
                    usuario.setNombre(inputData.nextLine());

                    System.out.println("Ingrese su email");
                    usuario.setEmail(inputData.nextLine());

                    usuarioList.add(usuario);
                    break;
                case 2:
                    for (Usuario usu : usuarioList) {
                        System.out.println(usu.toString());
                    }
                    break;
                case 3:
                    System.out.println("Digite el nombre del usuario que deseas eliminar");
                    String nombre = inputData.nextLine();
                    boolean flag = false;
                    for (Usuario user: usuarioList) {
                        if(user.getNombre().equals(nombre)) {
                            flag = true;
                            usuarioList.remove(user);
                            System.out.println("El usuario " + user.getNombre() + " Fue eliminado");
                            break;
                        }
                    }
                    if (!flag) {
                        System.out.println("El usuario ingresado no se existe");
                    }
                    break;
                case 4:
                    System.out.println("Digite el nombre del usuario que deseas actualizar");
                    String nombreUpdate = inputData.nextLine();
                    boolean flagUpdate = false;
                    for (Usuario user: usuarioList) {
                        if(user.getNombre().equals(nombreUpdate)) {
                            flagUpdate = true;
                            System.out.println("Ingrese el ID");
                            user.setId(Long.parseLong(inputData.nextLine()));

                            System.out.println("Ingrese su nombre");
                            user.setNombre(inputData.nextLine());

                            System.out.println("Ingrese su email");
                            user.setEmail(inputData.nextLine());
                            System.out.println("El usuario " + user.getNombre() + " Fue actualizado");
                            break;
                        }
                    }
                    if (!flagUpdate) {
                        System.out.println("El usuario ingresado no se actualizo");
                    }
                    break;
                case 5:
                    System.out.println("Digite el nombre del usuario que deseas buscar");
                    String nombreSearch = inputData.nextLine();
                    boolean flagSearch = false;
                    for (Usuario user: usuarioList) {
                        if(user.getNombre().equals(nombreSearch)) {
                            flagSearch = true;
                            System.out.println(user);
                            break;
                        }
                    }
                    if (!flagSearch) {
                        System.out.println("El usuario ingresado no se encontro");
                    }
                    break;
                case 6:
                    salir = true;
                    break;
            }
        }
    }

    public static void menu() {
        System.out.println("======================================\n" +
            "================ MENU ================\n" +
            "===   1=Ingresar usuario           ===\n" +
            "===   2=mostrar usuario            ===\n" +
            "===   3=eliminar usuario           ===\n" +
            "===   4=actualizar usuario         ===\n" +
            "===   5=Buscar usuario             ===\n" +
            "===   6=salir                      ===\n" +
            "======================================");
    }
}
