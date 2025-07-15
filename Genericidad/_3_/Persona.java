package Genericidad._3_;

public class Persona implements Comparable<Persona> {
    private String nombre;
    private int edad;
    
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public String getNombre() {return nombre;}
    public int getEdad() {return edad;}
    
    @Override
    public int compareTo(Persona otra) {
        // Comparar por edad
        return Integer.compare(this.edad, otra.edad);
    }
    
    @Override
    public String toString() {
        return nombre + " (" + edad + " años)";
    }
}
