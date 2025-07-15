package Composicion._4_;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private String ruc;
    private List<Empleado> empleados;
    private List<Cliente> clientes;
    
    public Empresa(String nombre, String ruc) {
        this.nombre = nombre;
        this.ruc = ruc;
        this.empleados = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }
    
    public String getNombre() {return nombre;}
    public String getRuc() {return ruc;}
    public List<Empleado> getEmpleados() {return empleados;}
    public List<Cliente> getClientes() {return clientes;}
    
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setRuc(String ruc) {this.ruc = ruc;}
    
    public void agregarEmpleado(Empleado empleado) {
        this.empleados.add(empleado);
    }
    
    public void agregarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }
    
    // Método para eliminar empleados que también son clientes
    public void eliminarEmpleadosQueEsCliente() {
        List<Empleado> empleadosAEliminar = new ArrayList<>();
        
        for (Empleado empleado : empleados) {
            for (Cliente cliente : clientes) {
                if (empleado.getCi().equals(cliente.getCi())) {
                    empleadosAEliminar.add(empleado);
                    System.out.println("Eliminando empleado que también es cliente: " + empleado.getNombre());
                    break;
                }
            }
        }
        
        empleados.removeAll(empleadosAEliminar);
    }
    
    // Método para mostrar cargo de empleado por CI
    public void mostrarCargoEmpleado(String ci) {
        for (Empleado empleado : empleados) {
            if (empleado.getCi().equals(ci)) {
                System.out.println("El empleado con CI " + ci + " tiene el cargo: " + empleado.getCargo());
                return;
            }
        }
        System.out.println("No se encontró empleado con CI: " + ci);
    }
    
    // Método para mostrar lista actualizada de empleados
    public void mostrarEmpleados() {
        System.out.println("Lista de empleados de " + nombre + ":");
        for (Empleado empleado : empleados) {
            empleado.mostrarEmpleado();
        }
    }
    
    // Método para mostrar clientes
    public void mostrarClientes() {
        System.out.println("Lista de clientes de " + nombre + ":");
        for (Cliente cliente : clientes) {
            cliente.mostrarCliente();
        }
    }
}
