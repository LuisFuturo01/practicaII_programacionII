package Genericidad._5_;

public class Asesor {
    private String nombre;
    private String especialidad;

    public Asesor(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void mostrarAsesor() {
        System.out.println("Asesor: " + nombre + " - Especialidad: " + especialidad);
    }
}