package Genericidad._5_;

import java.util.ArrayList;
import java.util.List;

public class Libro extends Publicacion {
    private String isbn;
    private Editorial editorial;
    private List<Autor> autores;

    public Libro(String titulo, int anioPublicacion, String isbn, Editorial editorial) {
        super(titulo, anioPublicacion);
        this.isbn = isbn;
        this.editorial = editorial;
        this.autores = new ArrayList<>();
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void agregarAutor(Autor autor) {
        autores.add(autor);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("=== LIBRO ===");
        System.out.println("Título: " + titulo);
        System.out.println("Año de publicación: " + anioPublicacion);
        System.out.println("ISBN: " + isbn);
        if (editorial != null) {
            editorial.mostrarEditorial();
        }
        System.out.println("Autores:");
        for (Autor autor : autores) {
            autor.mostrarAutor();
        }
        System.out.println("====================");
    }
}