package Composicion._4_;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("TechCorp", "12345678901");

        Empleado emp1 = new Empleado("Juan Pérez", "12345678", "70123456", "Gerente", 8000.0);
        Empleado emp2 = new Empleado("María García", "87654321", "70654321", "Desarrollador", 5000.0);
        Empleado emp3 = new Empleado("Carlos López", "11223344", "70112233", "Analista", 4500.0);
        Empleado emp4 = new Empleado("Ana Martínez", "44556677", "70445566", "Diseñadora", 4000.0);

        Cliente cli1 = new Cliente("Pedro Rodríguez", "99887766", "70998877", "Premium", 50000.0);
        Cliente cli2 = new Cliente("Laura Fernández", "55443322", "70554433", "Regular", 20000.0);
        Cliente cli3 = new Cliente("María García", "87654321", "70654321", "VIP", 100000.0);
        Cliente cli4 = new Cliente("Roberto Silva", "33221100", "70332211", "Regular", 15000.0);

        empresa.agregarEmpleado(emp1);
        empresa.agregarEmpleado(emp2);
        empresa.agregarEmpleado(emp3);
        empresa.agregarEmpleado(emp4);

        empresa.agregarCliente(cli1);
        empresa.agregarCliente(cli2);
        empresa.agregarCliente(cli3);
        empresa.agregarCliente(cli4);

        System.out.println("=== ESTADO INICIAL ===");
        empresa.mostrarEmpleados();
        System.out.println();
        empresa.mostrarClientes();

        System.out.println("\n=== ELIMINANDO EMPLEADOS QUE SON CLIENTES ===");
        empresa.eliminarEmpleadosQueEsCliente();

        System.out.println("\n=== LISTA ACTUALIZADA DE EMPLEADOS ===");
        empresa.mostrarEmpleados();

        System.out.println("\n=== MOSTRANDO CARGO DE EMPLEADO POR CI ===");
        empresa.mostrarCargoEmpleado("12345678");
        empresa.mostrarCargoEmpleado("11223344");
        empresa.mostrarCargoEmpleado("87654321");
    }
}