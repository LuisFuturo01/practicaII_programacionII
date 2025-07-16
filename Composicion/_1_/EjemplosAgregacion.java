package Composicion._1_;



public class EjemplosAgregacion {
    public static void main(String[] args) {
        System.out.println("=== EJEMPLOS DE AGREGACIÓN ===");

        Universidad uni = new Universidad("Universidad Mayor");
        Estudiante est1 = new Estudiante("Juan Pérez", "2021001");
        Estudiante est2 = new Estudiante("María García", "2021002");
        uni.agregarEstudiante(est1);
        uni.agregarEstudiante(est2);
        uni.mostrarEstudiantes();

        System.out.println();

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
            private Libro[] libros;
            private int nLibros;
            private static final int MAX_LIBROS = 50; 

            public Biblioteca(String nombre) {
                this.nombre = nombre;
                this.libros = new Libro[MAX_LIBROS];
                this.nLibros = 0;
            }

            public void agregarLibro(Libro libro) {
                if (nLibros < MAX_LIBROS) {
                    libros[nLibros] = libro;
                    nLibros++;
                } else {
                    System.out.println("La biblioteca " + nombre + " está llena. No se pueden agregar más libros.");
                }
            }

            public void mostrarLibros() {
                System.out.println("Libros en " + nombre + ":");
                for (int i = 0; i < nLibros; i++) {
                    System.out.println("- " + libros[i].getTitulo() + " por " + libros[i].getAutor());
                }
            }
        }

        Biblioteca biblio = new Biblioteca("Biblioteca Central");
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", "978-84-376-0494-7");
        Libro libro2 = new Libro("El Principito", "Antoine de Saint-Exupéry", "978-84-376-0495-8");
        biblio.agregarLibro(libro1);
        biblio.agregarLibro(libro2);
        biblio.mostrarLibros();

        System.out.println();

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
            private Jugador[] jugadores;
            private int nJugadores;
            private int MAX_JUGADORES = 25;

            public Equipo(String nombre) {
                this.nombre = nombre;
                this.jugadores = new Jugador[MAX_JUGADORES];
                this.nJugadores = 0;
            }

            public void agregarJugador(Jugador jugador) {
                if (nJugadores < MAX_JUGADORES) {
                    jugadores[nJugadores] = jugador;
                    nJugadores++;
                } else {
                    System.out.println("El equipo " + nombre + " está lleno. No se pueden agregar más jugadores.");
                }
            }

            public void mostrarJugadores() {
                System.out.println("Jugadores de " + nombre + ":");
                for (int i = 0; i < nJugadores; i++) {
                    System.out.println("- " + jugadores[i].getNombre() + " (#" + jugadores[i].getNumero() + ") - " + jugadores[i].getPosicion());
                }
            }
        }

        Equipo equipo = new Equipo("Bolívar");
        Jugador jug1 = new Jugador("Carlos Lampe", 1, "Portero");
        Jugador jug2 = new Jugador("Leonel Justiniano", 5, "Mediocampista");
        equipo.agregarJugador(jug1);
        equipo.agregarJugador(jug2);
        equipo.mostrarJugadores();
    }
}