package Genericidad._5_;

public class Main {
    public static void main(String[] args) {
        Repositorio<Publicacion> repositorioPublicaciones = new Repositorio<>();
        Repositorio<Autor> repositorioAutores = new Repositorio<>();

        Autor autor1 = new Autor("Gabriel García Márquez", "ggarcia@email.com");
        Autor autor2 = new Autor("Mario Vargas Llosa", "mvargas@email.com");
        Autor autor3 = new Autor("Carlos Fuentes", "cfuentes@email.com");
        Autor autor4 = new Autor("Dr. Ana López", "alopez@university.edu");

        repositorioAutores.agregar(autor1);
        repositorioAutores.agregar(autor2);
        repositorioAutores.agregar(autor3);
        repositorioAutores.agregar(autor4);

        Editorial editorial1 = new Editorial("Sudamericana", "Argentina");

        Libro libro1 = new Libro("Cien años de soledad", 1967, "978-84-376-0494-7", editorial1);
        libro1.agregarAutor(autor1);

        Articulo articulo1 = new Articulo("Literatura Latinoamericana Contemporánea", 2020, "Revista de Letras", 15);
        articulo1.agregarAutor(autor2);
        articulo1.agregarAutor(autor3);

        Tesis tesis1 = new Tesis("Impacto de la Globalización en la Literatura Contemporánea", 2021, "Doctorado en Literatura", "Dr. Pedro Martínez", "Literatura Latinoamericana");
        tesis1.agregarAutor(autor4);

        repositorioPublicaciones.agregar(libro1);
        repositorioPublicaciones.agregar(articulo1);
        repositorioPublicaciones.agregar(tesis1);

        System.out.println("=== REPOSITORIO DE AUTORES ===");
        repositorioAutores.mostrarTodo();

        System.out.println("\n=== REPOSITORIO DE PUBLICACIONES ===");
        repositorioPublicaciones.mostrarTodo();

        System.out.println("\n=== DEMOSTRACIÓN DE COMPOSICIÓN ===");
        System.out.println("Información del asesor de la tesis:");
        tesis1.getAsesor().mostrarAsesor();

        System.out.println("\n=== EJEMPLO DE ELIMINACIÓN ===");
        System.out.println("Eliminando el artículo del repositorio...");
        repositorioPublicaciones.eliminar(articulo1);

        System.out.println("\nRepositorio después de la eliminación:");
        repositorioPublicaciones.mostrarTodo();

        System.out.println("\nTamaño del repositorio de publicaciones: " + repositorioPublicaciones.size());
        System.out.println("Tamaño del repositorio de autores: " + repositorioAutores.size());
    }
}