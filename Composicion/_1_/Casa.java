package Composicion._1_;


public class Casa {
    private String direccion;
    private Habitacion[] habitaciones;
    private int nHabitaciones;
    private static final int MAX_HABITACIONES = 10; 

    public Casa(String direccion) {
        this.direccion = direccion;
        this.habitaciones = new Habitacion[MAX_HABITACIONES];
        this.nHabitaciones = 0;

        if (nHabitaciones < MAX_HABITACIONES) {
            habitaciones[nHabitaciones++] = new Habitacion("Sala", 20.0);
        }
        if (nHabitaciones < MAX_HABITACIONES) {
            habitaciones[nHabitaciones++] = new Habitacion("Cocina", 15.0);
        }
        if (nHabitaciones < MAX_HABITACIONES) {
            habitaciones[nHabitaciones++] = new Habitacion("Dormitorio", 18.0);
        }
    }

    public void mostrarHabitaciones() {
        System.out.println("Habitaciones de la casa en " + direccion + ":");
        for (int i = 0; i < nHabitaciones; i++) {
            System.out.println("- " + habitaciones[i].getTipo() + ": " + habitaciones[i].getArea() + " m²");
        }
    }

    public String getDireccion() {return direccion;}
    public Habitacion[] getHabitaciones() {return habitaciones;} 
    
}