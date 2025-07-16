package Genericidad._5_;

public class Tesis extends Publicacion {
    private String grado;
    private Asesor asesor;
    private Autor[] autores;
    private int nAutores;
    private static final int MAX_AUTORES = 10;

    public Tesis(String titulo, int anioPublicacion, String grado, String nombreAsesor, String especialidadAsesor) {
        super(titulo, anioPublicacion);
        this.grado = grado;
        this.asesor = new Asesor(nombreAsesor, especialidadAsesor);
        this.autores = new Autor[MAX_AUTORES];
        this.nAutores = 0;
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
        System.out.println("=== TESIS ===");
        System.out.println("Título: " + titulo);
        System.out.println("Año de publicación: " + anioPublicacion);
        System.out.println("Grado: " + grado);
        if (asesor != null) {
            asesor.mostrarAsesor();
        }
        System.out.println("Autores:");
        for (int i = 0; i < nAutores; i++) {
            autores[i].mostrarAutor();
        }
        System.out.println("=============");
    }
}