package Gestion_Archivos;

import Exportacion_Importacion.Exportador;
import Textos.Bot;
import java.util.ArrayList;
import java.util.List;

public class Inventario extends Bot {
    //Atributos
    private List<Libro> inventario = new ArrayList<Libro>();

    //Constructor
    public Inventario(){}

    //Getters
    public List<Libro> getInventario() {
        return inventario;
    }

    //Setter
    public void setInventario(List<Libro> inventario) {
        this.inventario = inventario;
    }

    //Metodos
    public int buscador(String titulo){
        for(int i = 0; i < inventario.size(); i++){
            if(inventario.get(i).getTitulo().equals(titulo)){
                return i;
            }
        }
        return -1;
    }

    public void modificar(){
        String[] modificador = preguntarQueModificar();
        if(buscador(modificador[0]) == -1){
            System.out.println("Lamentablemente este libro no se encuentra en el inventario...");
            modificar();
        }
        Exportador exportar = new Exportador();
        Libro book = inventario.get(buscador(modificador[0]));
        if(modificador[1].equals("Sede")){
            book.setSede(modificador[2]);
        } else if (modificador[1].equals("Edificio")) {
            book.setEdificio(modificador[2]);
        } else if (modificador[1].equals("Piso")) {
            book.setPiso(modificador[2]);
        } else if (modificador[1].equals("NumeroEstante")) {
            book.setEstanteNumero(modificador[2]);
        } else if (modificador[1].equals("SeccionEstante")) {
            book.setEstanteSeccion(modificador[2]);
        }

        exportar.exportarCSV(inventario);
    }

    public void eliminar(){
        String elim = preguntarEliminar();
        if(buscador(elim) == -1){
            System.out.println("Lamentablemente este libro no se encuentra en el inventario...");
            eliminar();
        }
        Exportador exportar = new Exportador();
        Libro book = inventario.get(buscador(elim));
        book.setLogic(false);
        inventario.add(buscador(elim), book);
        exportar.exportarCSV(inventario);
    }

    public void mostrarLibro(){
        String titulo = preguntarMostrarLibro();
        int i = buscador(titulo);
        System.out.println("\n");
        System.out.println("Informacion del libro " + inventario.get(i).getTitulo() + ": ");
        System.out.println(inventario.get(i).getTitulo() + " | " + inventario.get(i).getAutor() + " | " + inventario.get(i).getAnio() + " | " + inventario.get(i).getEstanteNumero()
                + " | " + inventario.get(i).getEstanteSeccion() + " | " + inventario.get(i).getPiso() + " | " + inventario.get(i).getEdificio() + " | " + inventario.get(i).getSede());
        System.out.println("\n");
    }

    public void mostrarInventario() {
        System.out.println("Titulo | Autor | Anio | EstanteNumero | EstanteSeccion | Piso | Edificio | Sede");
        System.out.println("================================================================================");
        for (Libro book : inventario) {
            if (book.isLogic()) {
                System.out.println(book.getTitulo() + " | " + book.getAutor() + " | " + book.getAnio() + " | " + book.getEstanteNumero()
                        + " | " + book.getEstanteSeccion() + " | " + book.getPiso() + " | " + book.getEdificio() + " | " + book.getSede());
            }
        }
    }
}
