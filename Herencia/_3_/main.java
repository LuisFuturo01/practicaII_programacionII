package Herencia._3_;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // b) Instanciar 2 objetos de cada hijo de Motorizado y NoMotorizado
        Auto auto1 = new Auto("Rojo", 180, "Gasolina", 4);
        Auto auto2 = new Auto("Azul", 200, "Diesel", 2);
        
        Tren tren1 = new Tren("Rojo", 120, "Gasolina", 8);
        Tren tren2 = new Tren("Verde", 150, "Eléctrico", 6);
        
        Bicicleta bici1 = new Bicicleta("Amarillo", 40, "Disco", 21);
        Bicicleta bici2 = new Bicicleta("Negro", 35, "Disco", 18);
        
        // Crear array de vehículos
        Vehiculo[] vehiculos = new Vehiculo[6];
        vehiculos[0] = auto1;
        vehiculos[1] = auto2;
        vehiculos[2] = tren1;
        vehiculos[3] = tren2;
        vehiculos[4] = bici1;
        vehiculos[5] = bici2;
        
        // Mostrar todos los vehículos
        System.out.println("=== TODOS LOS VEHÍCULOS ===");
        for (int i = 0; i < vehiculos.length; i++) {
            vehiculos[i].mostrarDatos();
        }
        
        // c) Comparar auto y tren
        System.out.println("\n=== COMPARACIÓN AUTO Y TREN ===");
        if (auto1.getColor().equals(tren1.getColor()) && 
            auto1.getTipoCombustible().equals(tren1.getTipoCombustible())) {
            System.out.println("El auto y el tren tienen el mismo color y combustible:");
            auto1.mostrarDatos();
            tren1.mostrarDatos();
        } else {
            System.out.println("El auto y el tren no tienen el mismo color y combustible");
            System.out.println("Datos del auto:");
            auto1.mostrarDatos();
            System.out.println("Datos del tren:");
            tren1.mostrarDatos();
        }
        
        // d) Verificar si dos bicicletas tienen el mismo tipo de frenos
        System.out.println("\n=== COMPARACIÓN BICICLETAS ===");
        if (bici1.mismoTipoFrenos(bici2)) {
            System.out.println("Ambas bicicletas tienen el mismo tipo de frenos: " + bici1.getTipoFrenos());
            bici1.mostrarDatos();
            bici2.mostrarDatos();
        } else {
            System.out.println("Las bicicletas tienen diferentes tipos de frenos");
            bici1.mostrarDatos();
            bici2.mostrarDatos();
        }
        
        // Funcionalidad adicional: buscar vehículo por color
        System.out.println("\n=== BUSCAR VEHÍCULO POR COLOR ===");
        System.out.print("Ingrese el color del vehículo a buscar: ");
        String colorBuscar = scanner.nextLine();
        
        boolean encontrado = false;
        for (int i = 0; i < vehiculos.length; i++) {
            if (vehiculos[i].getColor().equalsIgnoreCase(colorBuscar)) {
                System.out.println("Vehículo encontrado:");
                vehiculos[i].mostrarDatos();
                encontrado = true;
            }
        }
        
        if (!encontrado) {
            System.out.println("No se encontraron vehículos con ese color.");
        }
        
        // Mostrar estadísticas simples
        System.out.println("\n=== ESTADÍSTICAS ===");
        int totalVehiculos = vehiculos.length;
        int vehiculosMotorizados = 0;
        int vehiculosNoMotorizados = 0;
        int velocidadMaxTotal = 0;
        
        for (int i = 0; i < vehiculos.length; i++) {
            velocidadMaxTotal += vehiculos[i].getVelocidadMaxima();
            
            if (vehiculos[i] instanceof Motorizado) {
                vehiculosMotorizados++;
            } else if (vehiculos[i] instanceof NoMotorizado) {
                vehiculosNoMotorizados++;
            }
        }
        
        System.out.println("Total de vehículos: " + totalVehiculos);
        System.out.println("Vehículos motorizados: " + vehiculosMotorizados);
        System.out.println("Vehículos no motorizados: " + vehiculosNoMotorizados);
        System.out.println("Velocidad máxima promedio: " + (velocidadMaxTotal / totalVehiculos) + " km/h");
        
        scanner.close();
    }
}
