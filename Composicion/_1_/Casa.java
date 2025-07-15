package Composicion._1_;

import java.util.*;

public class Casa {
    private String direccion;
    private List<Habitacion> habitaciones;
    
    public Casa(String direccion) {
        this.direccion = direccion;
        this.habitaciones = new ArrayList<>();
        // Creamos habitaciones por defecto (composición)
        habitaciones.add(new Habitacion("Sala", 20.0));
        habitaciones.add(new Habitacion("Cocina", 15.0));
        habitaciones.add(new Habitacion("Dormitorio", 18.0));
    }
    
    public void mostrarHabitaciones() {
        System.out.println("Habitaciones de la casa en " + direccion + ":");
        for (Habitacion h : habitaciones) {
            System.out.println("- " + h.getTipo() + ": " + h.getArea() + " m²");
        }
    }
    
    public String getDireccion() {return direccion;}
    public List<Habitacion> getHabitaciones() {return habitaciones;}
}
