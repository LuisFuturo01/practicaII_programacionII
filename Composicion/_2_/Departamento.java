package Composicion._2_;

public class Departamento {
    private String area;
    private double presupuesto;
    private int nroEmpleados;
    private Empleado[] em;
    
    public Departamento(String area, double presupuesto) {
        this.area = area;
        this.presupuesto = presupuesto;
        this.em = new Empleado[50];
        this.nroEmpleados = 0;
    }
    
    public void agregarEmpleado(Empleado empleado) {
        if (nroEmpleados < 50) {
            em[nroEmpleados] = empleado;
            nroEmpleados++;
        }
    }
    
    public double calcularSalarioTotalDepartamento() {
        double total = 0;
        for (int i = 0; i < nroEmpleados; i++) {
            total += em[i].getSalario();
        }
        return total;
    }
    
    public boolean verificarEmpleado(String nombre) {
        for (int i = 0; i < nroEmpleados; i++) {
            if (em[i].getNombre().equals(nombre)) {
                return true;
            }
        }
        return false;
    }
    
    public String getArea() {return area;}
    public double getPresupuesto() {return presupuesto;}
    public int getNroEmpleados() {return nroEmpleados;}
    public Empleado[] getEm() {return em;}
    public void setArea(String area) {this.area = area;}
    public void setPresupuesto(double presupuesto) {this.presupuesto = presupuesto;}
}
