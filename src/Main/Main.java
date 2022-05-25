package Main;

import Exportacion_Importacion.Importador;
import Gestion_Archivos.Inventario;
import Menu.Menu;

public class Main {
    public static void main(String[] args) {
        //Lectura del archivo
        Importador archivo = new Importador();
        archivo.leerArchivo(args[0]);

        //Guardado de datos en una variable tipo inventario
        Inventario inventario = new Inventario();
        inventario.setInventario(archivo.getInv().getInventario()); //Guarda el CSV en el inventario de inventario c:

        //Llamar a que se ejecute el menu
        Menu menu = new Menu();
        menu.bienvenida();
        menu.preguntarQueHacer(inventario);
        System.out.println("Muchas gracias por acceder a la Biblioteca UAI\n");
    }
}
