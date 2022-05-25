package Exportacion_Importacion;

import Gestion_Archivos.Libro;
import com.csvreader.CsvWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.io.File;

public class Exportador {
    //Atributos
    private String salidaArchivo;
    private boolean existe;

    //Metodo
    public void exportarCSV(List<Libro> books){
        salidaArchivo = "inventario.csv";//nombre del archivo de salida
        existe = new File(salidaArchivo).exists();//Verifica si existe o no el archivo

        if(existe){
            File libros = new File(salidaArchivo);
            libros.delete();
        }

        try{

            CsvWriter salidaCSV = new CsvWriter(new FileWriter(salidaArchivo, true), ',');
            salidaCSV.write("titulo");
            salidaCSV.write("autor");
            salidaCSV.write("anio");
            salidaCSV.write("estante_numero");
            salidaCSV.write("estante_seccion");
            salidaCSV.write("piso");
            salidaCSV.write("edificio");
            salidaCSV.write("sede");

            salidaCSV.endRecord();

            for(Libro book: books){
                if(book.isLogic()){
                    salidaCSV.write(book.getTitulo());
                    salidaCSV.write(book.getAutor());
                    salidaCSV.write(book.getAnio());
                    salidaCSV.write(book.getEstanteNumero());
                    salidaCSV.write(book.getEstanteSeccion());
                    salidaCSV.write(book.getPiso());
                    salidaCSV.write(book.getEdificio());
                    salidaCSV.write(book.getSede());

                    salidaCSV.endRecord();
                }
            }
            salidaCSV.close();

        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
