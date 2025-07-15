package Composicion._2_;

public class Empresa {
    private String nombre;
    private int nroDeptos;
    private Departamento[] depto;
    
    public Empresa(String nombre) {
        this.nombre = nombre;
        this.depto = new Departamento[50];
        this.nroDeptos = 0;
    }
    
    public void agregarDepartamento(Departamento departamento) {
        if (nroDeptos < 50) {
            depto[nroDeptos] = departamento;
            nroDeptos++;
        }
    }
    
    public double calcularSalarioTotalEmpresa() {
        double total = 0;
        for (int i = 0; i < nroDeptos; i++) {
            total += depto[i].calcularSalarioTotalDepartamento();
        }
        return total;
    }
    
    public boolean verificarEmpleadoEnEmpresa(String nombre) {
        for (int i = 0; i < nroDeptos; i++) {
            if (depto[i].verificarEmpleado(nombre)) {
                return true;
            }
        }
        return false;
    }
    
    public String getNombre() {return nombre;}
    public int getNroDeptos() {return nroDeptos;}
    public Departamento[] getDepto() {return depto;}
    public void setNombre(String nombre) {this.nombre = nombre;}
}
