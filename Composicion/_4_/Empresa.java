package Composicion._4_;

public class Empresa {
    private String nombre;
    private String ruc;
    private Empleado[] empleados;
    private int nEmpleados;
    private Cliente[] clientes;
    private int nClientes;
    private static final int MAX_EMPLEADOS = 50;
    private static final int MAX_CLIENTES = 50;

    public Empresa(String nombre, String ruc) {
        this.nombre = nombre;
        this.ruc = ruc;
        this.empleados = new Empleado[MAX_EMPLEADOS];
        this.nEmpleados = 0;
        this.clientes = new Cliente[MAX_CLIENTES];
        this.nClientes = 0;
    }

    public String getNombre() {return nombre;}
    public String getRuc() {return ruc;}
    public Empleado[] getEmpleados() {return empleados;}
    public Cliente[] getClientes() {return clientes;}

    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setRuc(String ruc) {this.ruc = ruc;}

    public void agregarEmpleado(Empleado empleado) {
        if (nEmpleados < MAX_EMPLEADOS) {
            this.empleados[nEmpleados] = empleado;
            nEmpleados++;
        } else {
            System.out.println("No se puede agregar más empleados, la empresa está llena de empleados.");
        }
    }

    public void agregarCliente(Cliente cliente) {
        if (nClientes < MAX_CLIENTES) {
            this.clientes[nClientes] = cliente;
            nClientes++;
        } else {
            System.out.println("No se puede agregar más clientes, la empresa está llena de clientes.");
        }
    }

    public void eliminarEmpleadosQueEsCliente() {
        Empleado[] tempEmpleados = new Empleado[MAX_EMPLEADOS];
        int newNEmpleados = 0;

        for (int i = 0; i < nEmpleados; i++) {
            Empleado actualEmpleado = empleados[i];
            boolean esCliente = false;
            for (int j = 0; j < nClientes; j++) {
                if (actualEmpleado.getCi().equals(clientes[j].getCi())) {
                    esCliente = true;
                    System.out.println("Eliminando empleado que también es cliente: " + actualEmpleado.getNombre());
                    break;
                }
            }
            if (!esCliente) {
                tempEmpleados[newNEmpleados] = actualEmpleado;
                newNEmpleados++;
            }
        }
        this.empleados = tempEmpleados;
        this.nEmpleados = newNEmpleados;
    }

    public void mostrarCargoEmpleado(String ci) {
        for (int i = 0; i < nEmpleados; i++) {
            if (empleados[i].getCi().equals(ci)) {
                System.out.println("El empleado con CI " + ci + " tiene el cargo: " + empleados[i].getCargo());
                return;
            }
        }
        System.out.println("No se encontró empleado con CI: " + ci);
    }

    public void mostrarEmpleados() {
        System.out.println("Lista de empleados de " + nombre + ":");
        for (int i = 0; i < nEmpleados; i++) {
            empleados[i].mostrarEmpleado();
        }
    }

    public void mostrarClientes() {
        System.out.println("Lista de clientes de " + nombre + ":");
        for (int i = 0; i < nClientes; i++) {
            clientes[i].mostrarCliente();
        }
    }
}