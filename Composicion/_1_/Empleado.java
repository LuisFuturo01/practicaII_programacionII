package Composicion._1_;

public class Empleado {
    private String nombre;
    private String cargo;
    
    public Empleado(String nombre, String cargo) {
        this.nombre = nombre;
        this.cargo = cargo;
    }
    
    public String getNombre() {return nombre;}
    public String getCargo() {return cargo;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setCargo(String cargo) {this.cargo = cargo;}
}
