package Genericidad._4_;

public class Main {
    public static void main(String[] args) {
        // a) Crear una instancia de Inventario para almacenar vehículos
        Inventario<Vehiculo> inventario = new Inventario<>();
        
        // b) Agregar al inventario dos autos y una moto
        Auto auto1 = new Auto("Toyota", "Corolla", 25000, 4);
        Auto auto2 = new Auto("Honda", "Civic", 28000, 4);
        Moto moto1 = new Moto("Yamaha", "YZF-R1", 15000, 1000);
        
        inventario.agregar(auto1);
        inventario.agregar(auto2);
        inventario.agregar(moto1);
        
        System.out.println("\n=== INVENTARIO COMPLETO ===");
        inventario.mostrarTodos();
        
        // d) Contar cuántos vehículos superan un precio de Bs. 20,000
        int vehiculosCaros = inventario.contarVehiculosSuperioresA(20000);
        System.out.println("Vehículos que superan Bs. 20,000: " + vehiculosCaros);
        
        // e) Mostrar solamente las motos
        System.out.println();
        inventario.mostrarSoloMotos();
    }
}
