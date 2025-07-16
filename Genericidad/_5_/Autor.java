package Genericidad._5_;

public class Autor {
    private String nombre;
    private String correo;

    public Autor(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void mostrarAutor() {
        System.out.println("Autor: " + nombre + " (Email: " + correo + ")");
    }
}