package Menu;

import Gestion_Archivos.Inventario;
import java.util.Scanner;

public class Menu {
    //Metodos
    public void bienvenida(){
        System.out.println("Bienvenid@ a la biblioteca de la UAI");
    }

    public void preguntarQueHacer(Inventario inv){
        System.out.println("MENU");
        System.out.println("1: Buscar un libro por su titulo");
        System.out.println("2: Modificar datos de un libro");
        System.out.println("3: Eliminar un libro del inventario");
        System.out.println("4: Mostrar todo el inventario");
        System.out.println("5: Salir de la App");
        System.out.println("Elija una de las opciones por su respectivo numero: ");
        //pide datos
        String entradaTeclado;
        Scanner entradaEscaner = new Scanner (System.in);
        entradaTeclado = entradaEscaner.nextLine();
        System.out.println("\n");

        switch (entradaTeclado){
            case "1":
                inv.mostrarLibro();
                preguntarQueHacer(inv);
                break;
            case "2":
                inv.modificar();
                preguntarQueHacer(inv);
                break;
            case "3":
                inv.eliminar();
                preguntarQueHacer(inv);
                break;
            case "4":
                inv.mostrarInventario();
                preguntarQueHacer(inv);
                break;
            case "5":
                break;
            default:
                System.out.println("Por favor, seleccione una opcion valida...");
                preguntarQueHacer(inv);
        }
    }

}
