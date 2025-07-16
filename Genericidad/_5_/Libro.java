package Genericidad._5_;

public class Libro extends Publicacion {
    private String isbn;
    private Editorial editorial;
    private Autor[] autores;
    private int nAutores;
    private static final int MAX_AUTORES = 10;

    public Libro(String titulo, int anioPublicacion, String isbn, Editorial editorial) {
        super(titulo, anioPublicacion);
        this.isbn = isbn;
        this.editorial = editorial;
        this.autores = new Autor[MAX_AUTORES];
        this.nAutores = 0;
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

    public Autor[] getAutores() {
        return autores;
    }

    public void agregarAutor(Autor autor) {
        if (nAutores < MAX_AUTORES) {
            autores[nAutores++] = autor;
        } else {
            System.out.println("No se pueden agregar más autores, límite alcanzado.");
        }
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
        for (int i = 0; i < nAutores; i++) {
            autores[i].mostrarAutor();
        }
        System.out.println("===============");
    }
}