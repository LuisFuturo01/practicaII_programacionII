package Composicion._4_;

public class Empleado extends Persona {
    private String cargo;
    private double salario;
    
    public Empleado(String nombre, String ci, String telefono, String cargo, double salario) {
        super(nombre, ci, telefono);
        this.cargo = cargo;
        this.salario = salario;
    }
    
    public String getCargo() {return cargo;}
    public double getSalario() {return salario;}
    public void setCargo(String cargo) {this.cargo = cargo;}
    public void setSalario(double salario) {this.salario = salario;}
    
    public void mostrarEmpleado() {
        System.out.println("Empleado: " + nombre + " - CI: " + ci + " - Teléfono: " + telefono + 
                         " - Cargo: " + cargo + " - Salario: " + salario);
    }
}
