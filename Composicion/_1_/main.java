package Composicion._1_;

public class main {
    public static void main(String[] args) {
        System.out.println("=== EJEMPLO 1: AGREGACIÓN - UNIVERSIDAD Y ESTUDIANTES ===");
        Universidad universidad = new Universidad("Universidad Central");
        
        Estudiante est1 = new Estudiante("Juan Pérez", "2021001");
        Estudiante est2 = new Estudiante("María García", "2021002");
        Estudiante est3 = new Estudiante("Carlos López", "2021003");
        
        universidad.agregarEstudiante(est1);
        universidad.agregarEstudiante(est2);
        universidad.agregarEstudiante(est3);
        
        universidad.mostrarEstudiantes();
        
        System.out.println("\n=== EJEMPLO 2: COMPOSICIÓN - CASA Y HABITACIONES ===");
        Casa casa = new Casa("Av. 6 de Agosto #123");
        casa.mostrarHabitaciones();
        
        System.out.println("\n=== EJEMPLO 3: COMBINADO - EMPRESA (COMPOSICIÓN Y AGREGACIÓN) ===");
        Empresa empresa = new Empresa("TechCorp");
        
        Empleado emp1 = new Empleado("Ana Morales", "Gerente");
        Empleado emp2 = new Empleado("Luis Vargas", "Desarrollador");
        Empleado emp3 = new Empleado("Sofia Quispe", "Analista");
        
        empresa.getDepartamentos()[0].agregarEmpleado(emp1);
        empresa.getDepartamentos()[1].agregarEmpleado(emp2); 
        empresa.getDepartamentos()[2].agregarEmpleado(emp3);
        
        empresa.mostrarDepartamentos();
    }
}