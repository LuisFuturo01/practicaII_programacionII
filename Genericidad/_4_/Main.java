package Genericidad._4_;

public class Main {
    public static void main(String[] args) {
        Inventario<Vehiculo> inventario = new Inventario<>();

        Auto auto1 = new Auto("Toyota", "Corolla", 25000, 4, "Gasolina");
        Auto auto2 = new Auto("Honda", "Civic", 28000, 4,"Diesel");
        Moto moto1 = new Moto("Yamaha", "YZF-R1",15023.0, 15000, "Deportiva");

        inventario.agregar(auto1);
        inventario.agregar(auto2);
        inventario.agregar(moto1);

        System.out.println("\n=== INVENTARIO COMPLETO ===");
        inventario.mostrarTodos();

        int vehiculosCaros = inventario.contarVehiculosSuperioresA(20000);
        System.out.println("Vehículos que superan Bs. 20,000: " + vehiculosCaros);

        System.out.println();
        inventario.mostrarSoloMotos();
    }
}