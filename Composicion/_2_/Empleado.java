package Composicion._2_;

public class Empleado {
    private String nombre;
    private double salario;
    
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
    
    public String getNombre() {return nombre;}
    public double getSalario() {return salario;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setSalario(double salario) {this.salario = salario;}
    
    public int compararSalario(Empleado otro) {
        if (this.salario > otro.salario) return 1;
        if (this.salario < otro.salario) return -1;
        return 0;
    }
}
