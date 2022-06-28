package Gestion_Archivos;

public class Libro {
    //Atributos
    private String titulo;
    private String autor;
    private String anio;
    private String estanteNumero;
    private String estanteSeccion;
    private String piso;
    private String edificio;
    private String sede;
    private boolean logic;

    //Constructor
    public Libro(String titulo, String autor, String anio, String estanteNumero, String estanteSeccion, String piso, String edificio, String sede, boolean logic) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.estanteNumero = estanteNumero;
        this.estanteSeccion = estanteSeccion;
        this.piso = piso;
        this.edificio = edificio;
        this.sede = sede;
        this.logic = logic;
    }

    //Getters
    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public String getAnio() {
        return anio;
    }

    public String getEstanteNumero(){
        return estanteNumero;
    }

    public String getEstanteSeccion(){
        return estanteSeccion;
    }

    public String getPiso(){
        return piso;
    }

    public String getEdificio(){
        return edificio;
    }

    public String getSede(){
        return sede;
    }

    public boolean isLogic() {
        return logic;
    }

    //Setters
    public void setEstanteNumero(String estanteNumero) {
        this.estanteNumero = estanteNumero;
    }

    public void setEstanteSeccion(String estanteSeccion) {
        this.estanteSeccion = estanteSeccion;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public void setEdificio(String edificio) {
        this.edificio = edificio;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public void setLogic(boolean logic) {
        this.logic = logic;
    }
}
