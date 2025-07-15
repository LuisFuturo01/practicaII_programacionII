package Genericidad._5_;

import java.util.ArrayList;
import java.util.List;

public class Tesis extends Publicacion {
    private String grado;
    private Asesor asesor; // Composición
    private List<Autor> autores; // Agregación
    
    public Tesis(String titulo, int anioPublicacion, String grado, String nombreAsesor, String especialidadAsesor) {
        super(titulo, anioPublicacion);
        this.grado = grado;
        this.asesor = new Asesor(nombreAsesor, especialidadAsesor); // Composición
        this.autores = new ArrayList<>();
    }
    
    public String getGrado() {
        return grado;
    }
    
    public void setGrado(String grado) {
        this.grado = grado;
    }
    
    public Asesor getAsesor() {
        return asesor;
    }
    
    public List<Autor> getAutores() {
        return autores;
    }
    
    public void agregarAutor(Autor autor) {
        autores.add(autor);
    }
    
    @Override
    public void mostrarInfo() {
        System.out.println("=== TESIS ===");
        System.out.println("Título: " + titulo);
        System.out.println("Año de publicación: " + anioPublicacion);
        System.out.println("Grado: " + grado);
        if (asesor != null) {
            asesor.mostrarAsesor();
        }
        System.out.println("Autores:");
        for (Autor autor : autores) {
            autor.mostrarAutor();
        }
        System.out.println("================");
    }
}
