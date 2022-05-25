package Textos;

import java.util.Scanner;

public class Bot {
    //Atributos
    String[] modificador = new String[3];

    //Metodos
    private String preguntarModificar(){
        System.out.println("Por favor, introduzca el titulo del libro que desea modificar: ");
        String entradaTeclado;
        Scanner entradaEscaner = new Scanner (System.in);
        entradaTeclado = entradaEscaner.nextLine();
        System.out.println("\n");
        return entradaTeclado;
    }

    public String preguntarEliminar(){
        System.out.println("Por favor, introduzca el titulo del libro que desea eliminar: ");
        String entradaTeclado;
        Scanner entradaEscaner = new Scanner (System.in);
        entradaTeclado = entradaEscaner.nextLine();
        System.out.println("\n");

        return entradaTeclado;
    }

    public String[] preguntarQueModificar(){
        //Falta poner que solo se puede poner sede, edificio, piso, etc...
        modificador[0] = preguntarModificar();
        System.out.println("Por favor, introduzca el dato que quiera modificar del libro " + modificador[0] + " (Sede, Edificio, Piso, NumeroEstante, SeccionEstante): ");
        String entradaTeclado;
        Scanner entradaEscaner = new Scanner (System.in);
        entradaTeclado = entradaEscaner.nextLine();
        System.out.println("\n");
        modificador[1] = entradaTeclado;
        System.out.println("Introduzca el nuevo valor de " + modificador[1] + " que desea: ");
        String entradaTeclado2;
        Scanner entradaEscaner2 = new Scanner (System.in);
        entradaTeclado2 = entradaEscaner2.nextLine();
        System.out.println("\n");
        modificador[2] = entradaTeclado2;


        return modificador;
    }

    public String preguntarMostrarLibro(){
        System.out.println("Por favor, introduzca el titulo del libro que desea obtener sus datos: ");
        String entradaTeclado;
        Scanner entradaEscaner = new Scanner (System.in);
        entradaTeclado = entradaEscaner.nextLine();
        System.out.println("\n");

        return entradaTeclado;
    }
}
