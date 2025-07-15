package Composicion._2_;

public class main {
    public static void main(String[] args) {
        // Crear empresa
        Empresa empresa = new Empresa("TechSolutions");
        
        // Crear departamentos
        Departamento deptIT = new Departamento("Tecnología", 100000.0);
        Departamento deptRRHH = new Departamento("Recursos Humanos", 50000.0);
        Departamento deptVentas = new Departamento("Ventas", 75000.0);
        
        // Crear empleados
        Empleado emp1 = new Empleado("Juan Pérez", 5000.0);
        Empleado emp2 = new Empleado("María García", 6000.0);
        Empleado emp3 = new Empleado("Carlos López", 4500.0);
        Empleado emp4 = new Empleado("Ana Morales", 5500.0);
        Empleado emp5 = new Empleado("Luis Vargas", 4000.0);
        Empleado emp6 = new Empleado("Sofia Quispe", 5200.0);
        
        // Agregar empleados a departamentos
        deptIT.agregarEmpleado(emp1);
        deptIT.agregarEmpleado(emp2);
        deptRRHH.agregarEmpleado(emp3);
        deptRRHH.agregarEmpleado(emp4);
        deptVentas.agregarEmpleado(emp5);
        deptVentas.agregarEmpleado(emp6);
        
        // Agregar departamentos a empresa
        empresa.agregarDepartamento(deptIT);
        empresa.agregarDepartamento(deptRRHH);
        empresa.agregarDepartamento(deptVentas);
        
        // Probar métodos
        System.out.println("=== SALARIOS TOTALES POR DEPARTAMENTO ===");
        System.out.println("Departamento IT: Bs. " + deptIT.calcularSalarioTotalDepartamento());
        System.out.println("Departamento RRHH: Bs. " + deptRRHH.calcularSalarioTotalDepartamento());
        System.out.println("Departamento Ventas: Bs. " + deptVentas.calcularSalarioTotalDepartamento());
        
        System.out.println("\n=== VERIFICAR EMPLEADOS ===");
        System.out.println("¿Juan Pérez está en IT? " + deptIT.verificarEmpleado("Juan Pérez"));
        System.out.println("¿Pedro Sánchez está en RRHH? " + deptRRHH.verificarEmpleado("Pedro Sánchez"));
        
        System.out.println("\n=== COMPARAR SALARIOS ===");
        int comparacion = emp1.compararSalario(emp2);
        if (comparacion > 0) {
            System.out.println(emp1.getNombre() + " gana más que " + emp2.getNombre());
        } else if (comparacion < 0) {
            System.out.println(emp1.getNombre() + " gana menos que " + emp2.getNombre());
        } else {
            System.out.println(emp1.getNombre() + " y " + emp2.getNombre() + " ganan lo mismo");
        }
        
        System.out.println("\nSalario total de la empresa: Bs. " + empresa.calcularSalarioTotalEmpresa());
    }
}
