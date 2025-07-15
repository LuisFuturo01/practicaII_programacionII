package Composicion._1_;

import java.util.*;

// EJEMPLO 1 - AGREGACIÓN: Universidad y Estudiante
class Estudiante {
    private String nombre;
    private String codigo;
    
    public Estudiante(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }
    
    public String getNombre() {return nombre;}
    public String getCodigo() {return codigo;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setCodigo(String codigo) {this.codigo = codigo;}
}

class Universidad {
    private String nombre;
    private List<Estudiante> estudiantes;
    
    public Universidad(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }
    
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }
    
    public void mostrarEstudiantes() {
        System.out.println("Estudiantes de " + nombre + ":");
        for (Estudiante e : estudiantes) {
            System.out.println("- " + e.getNombre() + " (" + e.getCodigo() + ")");
        }
    }
    
    public String getNombre() {return nombre;}
}

// EJEMPLO 2 - AGREGACIÓN: Biblioteca y Libro
class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    
    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }
    
    public String getTitulo() {return titulo;}
    public String getAutor() {return autor;}
    public String getIsbn() {return isbn;}
}

class Biblioteca {
    private String nombre;
    private List<Libro> libros;
    
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }
    
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }
    
    public void mostrarLibros() {
        System.out.println("Libros en " + nombre + ":");
        for (Libro l : libros) {
            System.out.println("- " + l.getTitulo() + " por " + l.getAutor());
        }
    }
}

// EJEMPLO 3 - AGREGACIÓN: Equipo y Jugador
class Jugador {
    private String nombre;
    private int numero;
    private String posicion;
    
    public Jugador(String nombre, int numero, String posicion) {
        this.nombre = nombre;
        this.numero = numero;
        this.posicion = posicion;
    }
    
    public String getNombre() {return nombre;}
    public int getNumero() {return numero;}
    public String getPosicion() {return posicion;}
}

class Equipo {
    private String nombre;
    private List<Jugador> jugadores;
    
    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }
    
    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }
    
    public void mostrarJugadores() {
        System.out.println("Jugadores de " + nombre + ":");
        for (Jugador j : jugadores) {
            System.out.println("- " + j.getNombre() + " (#" + j.getNumero() + ") - " + j.getPosicion());
        }
    }
}

public class EjemplosAgregacion {
    public static void main(String[] args) {
        System.out.println("=== EJEMPLOS DE AGREGACIÓN ===");
        
        // Ejemplo 1: Universidad y Estudiantes
        Universidad uni = new Universidad("Universidad Mayor");
        Estudiante est1 = new Estudiante("Juan Pérez", "2021001");
        Estudiante est2 = new Estudiante("María García", "2021002");
        uni.agregarEstudiante(est1);
        uni.agregarEstudiante(est2);
        uni.mostrarEstudiantes();
        
        System.out.println();
        
        // Ejemplo 2: Biblioteca y Libros
        Biblioteca biblio = new Biblioteca("Biblioteca Central");
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", "978-84-376-0494-7");
        Libro libro2 = new Libro("El Principito", "Antoine de Saint-Exupéry", "978-84-376-0495-8");
        biblio.agregarLibro(libro1);
        biblio.agregarLibro(libro2);
        biblio.mostrarLibros();
        
        System.out.println();
        
        // Ejemplo 3: Equipo y Jugadores
        Equipo equipo = new Equipo("Bolívar");
        Jugador jug1 = new Jugador("Carlos Lampe", 1, "Portero");
        Jugador jug2 = new Jugador("Leonel Justiniano", 5, "Mediocampista");
        equipo.agregarJugador(jug1);
        equipo.agregarJugador(jug2);
        equipo.mostrarJugadores();
    }
}
