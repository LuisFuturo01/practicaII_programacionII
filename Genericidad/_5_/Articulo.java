package Genericidad._5_;

import java.util.ArrayList;
import java.util.List;

public class Articulo extends Publicacion {
    private String revista;
    private int volumen;
    private List<Autor> autores; // Agregación
    
    public Articulo(String titulo, int anioPublicacion, String revista, int volumen) {
        super(titulo, anioPublicacion);
        this.revista = revista;
        this.volumen = volumen;
        this.autores = new ArrayList<>();
    }
    
    public String getRevista() {
        return revista;
    }
    
    public void setRevista(String revista) {
        this.revista = revista;
    }
    
    public int getVolumen() {
        return volumen;
    }
    
    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
    
    public List<Autor> getAutores() {
        return autores;
    }
    
    public void agregarAutor(Autor autor) {
        autores.add(autor);
    }
    
    @Override
    public void mostrarInfo() {
        System.out.println("=== ARTÍCULO ===");
        System.out.println("Título: " + titulo);
        System.out.println("Año de publicación: " + anioPublicacion);
        System.out.println("Revista: " + revista);
        System.out.println("Volumen: " + volumen);
        System.out.println("Autores:");
        for (Autor autor : autores) {
            autor.mostrarAutor();
        }
        System.out.println("================");
    }
}
