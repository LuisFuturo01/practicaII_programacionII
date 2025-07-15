package Composicion._1_;

public class Departamento {
    private String nombre;
    private int nEmpleados;
    private Empleado[] empleados;
    
    public Departamento(String nombre) {
        this.nombre = nombre;
        this.empleados = new Empleado[20];
        this.nEmpleados = 0;
    }
    
    public void agregarEmpleado(Empleado empleado) {
        if (nEmpleados < 20) {
            empleados[nEmpleados] = empleado;
            nEmpleados++;
        }
    }
    
    public void mostrarEmpleados() {
        System.out.println("Empleados del departamento " + nombre + ":");
        for (int i = 0; i < nEmpleados; i++) {
            System.out.println("- " + empleados[i].getNombre() + " (" + empleados[i].getCargo() + ")");
        }
    }
    
    public String getNombre() {return nombre;}
    public Empleado[] getEmpleados() {return empleados;}
    public int getNEmpleados() {return nEmpleados;}
}
