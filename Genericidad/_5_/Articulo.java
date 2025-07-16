package Genericidad._5_;

public class Articulo extends Publicacion {
    private String revista;
    private int volumen;
    private Autor[] autores;
    private int nAutores;
    private static final int MAX_AUTORES = 10;

    public Articulo(String titulo, int anioPublicacion, String revista, int volumen) {
        super(titulo, anioPublicacion);
        this.revista = revista;
        this.volumen = volumen;
        this.autores = new Autor[MAX_AUTORES];
        this.nAutores = 0;
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
        System.out.println("=== ARTÍCULO ===");
        System.out.println("Título: " + titulo);
        System.out.println("Año de publicación: " + anioPublicacion);
        System.out.println("Revista: " + revista);
        System.out.println("Volumen: " + volumen);
        System.out.println("Autores:");
        for (int i = 0; i < nAutores; i++) {
            autores[i].mostrarAutor();
        }
        System.out.println("================");
    }
}