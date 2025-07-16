package Genericidad._4_;

import java.util.ArrayList;
import java.util.List;

public class Inventario<T extends Vehiculo> {
    private List<T> vehiculos;

    public Inventario() {
        this.vehiculos = new ArrayList<>();
    }

    public void agregar(T vehiculo) {
        vehiculos.add(vehiculo);
        System.out.println("Vehículo agregado: " + vehiculo.getClass().getSimpleName());
    }

    public void mostrarTodos() {
        System.out.println("=== INVENTARIO DE VEHÍCULOS ===");
        for (T vehiculo : vehiculos) {
            System.out.println("Tipo: " + vehiculo.getClass().getSimpleName());
            System.out.println("Marca: " + vehiculo.getMarca());
            System.out.println("Modelo: " + vehiculo.getModelo());
            System.out.println("Precio: Bs. " + vehiculo.getPrecio());
            System.out.println("------------------------");
        }
    }

    public int contarVehiculosSuperioresA(double precio) {
        int contador = 0;
        for (T vehiculo : vehiculos) {
            if (vehiculo.getPrecio() > precio) {
                contador++;
            }
        }
        return contador;
    }

    public void mostrarSoloMotos() {
        System.out.println("=== SOLO MOTOS ===");
        for (T vehiculo : vehiculos) {
            if (vehiculo instanceof Moto) {
                System.out.println("Marca: " + vehiculo.getMarca());
                System.out.println("Modelo: " + vehiculo.getModelo());
                System.out.println("Precio: Bs. " + vehiculo.getPrecio());
                System.out.println("------------------------");
            }
        }
    }

    public List<T> getVehiculos() {
        return vehiculos;
    }
}