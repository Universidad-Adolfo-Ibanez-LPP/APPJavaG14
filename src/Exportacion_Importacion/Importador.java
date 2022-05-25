package Exportacion_Importacion;

import Gestion_Archivos.Inventario;
import Gestion_Archivos.Libro;
import com.csvreader.CsvReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Importador {
    //Atributos
    private Inventario inv = new Inventario();

    //Getter
    public Inventario getInv() {
        return inv;
    }

    //Metodo
    public void leerArchivo(String name) {

        try {
            List<Libro> books = new ArrayList<Libro>(); //Lista donde se guardan los libros
            CsvReader leerLibros = new CsvReader(new FileReader(name));
            leerLibros.readHeaders();

            while(leerLibros.readRecord()){
                String titulo = leerLibros.get(0);
                String autor = leerLibros.get(1);
                String anio = leerLibros.get(2);
                String estanteNumero = leerLibros.get(3);
                String estanteSeccion = leerLibros.get(4);
                String piso = leerLibros.get(5);
                String edificio = leerLibros.get(6);
                String sede = leerLibros.get(7);
                boolean logic = true;

                books.add(new Libro(titulo, autor, anio, estanteNumero, estanteSeccion, piso, edificio, sede, logic));
            }
            this.inv.setInventario(books);
            leerLibros.close();

        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }


}
