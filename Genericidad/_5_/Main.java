package Genericidad._5_;

public class Main {
    public static void main(String[] args) {
        // Crear repositorios genéricos
        Repositorio<Publicacion> repositorioPublicaciones = new Repositorio<>();
        Repositorio<Autor> repositorioAutores = new Repositorio<>();
        
        // Crear autores
        Autor autor1 = new Autor("Gabriel García Márquez", "ggarcia@email.com");
        Autor autor2 = new Autor("Mario Vargas Llosa", "mvargas@email.com");
        Autor autor3 = new Autor("Carlos Fuentes", "cfuentes@email.com");
        Autor autor4 = new Autor("Dr. Ana López", "alopez@university.edu");
        
        // Agregar autores al repositorio
        repositorioAutores.agregar(autor1);
        repositorioAutores.agregar(autor2);
        repositorioAutores.agregar(autor3);
        repositorioAutores.agregar(autor4);
        
        // Crear editorial
        Editorial editorial1 = new Editorial("Sudamericana", "Argentina");
        
        // Crear al menos 1 objeto de cada tipo
        
        // 1. Crear un Libro
        Libro libro1 = new Libro("Cien años de soledad", 1967, "978-84-376-0494-7", editorial1);
        libro1.agregarAutor(autor1);
        
        // 2. Crear un Artículo
        Articulo articulo1 = new Articulo("Literatura Latinoamericana Contemporánea", 2020, "Revista de Letras", 15);
        articulo1.agregarAutor(autor2);
        articulo1.agregarAutor(autor3);
        
        // 3. Crear una Tesis (con composición del asesor)
        Tesis tesis1 = new Tesis("El realismo mágico en la narrativa contemporánea", 2021, "Doctorado en Literatura", "Dr. Pedro Martínez", "Literatura Latinoamericana");
        tesis1.agregarAutor(autor4);
        
        // Guardar las publicaciones en el repositorio genérico
        repositorioPublicaciones.agregar(libro1);
        repositorioPublicaciones.agregar(articulo1);
        repositorioPublicaciones.agregar(tesis1);
        
        // Mostrar toda la información usando mostrarInfo()
        System.out.println("=== REPOSITORIO DE AUTORES ===");
        repositorioAutores.mostrarTodo();
        
        System.out.println("\n=== REPOSITORIO DE PUBLICACIONES ===");
        repositorioPublicaciones.mostrarTodo();
        
        // Demostrar que la composición funciona correctamente
        System.out.println("\n=== DEMOSTRACIÓN DE COMPOSICIÓN ===");
        System.out.println("Información del asesor de la tesis:");
        tesis1.getAsesor().mostrarAsesor();
        
        // Ejemplo de eliminación
        System.out.println("\n=== EJEMPLO DE ELIMINACIÓN ===");
        System.out.println("Eliminando el artículo del repositorio...");
        repositorioPublicaciones.eliminar(articulo1);
        
        System.out.println("\nRepositorio después de la eliminación:");
        repositorioPublicaciones.mostrarTodo();
        
        System.out.println("\nTamaño del repositorio de publicaciones: " + repositorioPublicaciones.size());
        System.out.println("Tamaño del repositorio de autores: " + repositorioAutores.size());
    }
}
