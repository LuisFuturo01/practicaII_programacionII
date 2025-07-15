package Composicion._1_;

public class Empresa {
    private String nombre;
    private int nDepartamentos;
    private Departamento[] departamentos;
    
    public Empresa(String nombre) {
        this.nombre = nombre;
        this.departamentos = new Departamento[10];
        this.nDepartamentos = 0;
        // Creamos departamentos por defecto (composición)
        departamentos[0] = new Departamento("Recursos Humanos");
        departamentos[1] = new Departamento("Desarrollo");
        departamentos[2] = new Departamento("Ventas");
        this.nDepartamentos = 3;
    }
    
    public void mostrarDepartamentos() {
        System.out.println("Departamentos de " + nombre + ":");
        for (int i = 0; i < nDepartamentos; i++) {
            System.out.println("- " + departamentos[i].getNombre());
            departamentos[i].mostrarEmpleados();
        }
    }
    
    public String getNombre() {return nombre;}
    public Departamento[] getDepartamentos() {return departamentos;}
    public int getNDepartamentos() {return nDepartamentos;}
}
