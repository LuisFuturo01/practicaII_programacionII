package Genericidad._4_;

public class Inventario<T extends Vehiculo> {
    private T[] vehiculos;
    private int count;

    public Inventario() {
        this.vehiculos = (T[]) new Vehiculo[100]; // Assuming a maximum of 100 vehicles
        this.count = 0;
    }

    public void agregar(T vehiculo) {
        if (count < vehiculos.length) {
            vehiculos[count] = vehiculo;
            count++;
            System.out.println("Vehículo agregado: " + vehiculo.getClass().getSimpleName());
        } else {
            System.out.println("Inventario lleno, no se puede agregar más vehículos.");
        }
    }

    public void mostrarTodos() {
        System.out.println("=== INVENTARIO DE VEHÍCULOS ====");
        for (int i = 0; i < count; i++) {
            T vehiculo = vehiculos[i];
            System.out.println("Tipo: " + vehiculo.getClass().getSimpleName());
            System.out.println("Marca: " + vehiculo.getMarca());
            System.out.println("Modelo: " + vehiculo.getModelo());
            System.out.println("Precio: Bs. " + vehiculo.getPrecio());
            System.out.println("------------------------");
        }
    }

    public int contarVehiculosSuperioresA(double precio) {
        int contador = 0;
        for (int i = 0; i < count; i++) {
            if (vehiculos[i].getPrecio() > precio) {
                contador++;
            }
        }
        return contador;
    }

    public void mostrarSoloMotos() {
        System.out.println("=== SOLO MOTOS ===");
        for (int i = 0; i < count; i++) {
            T vehiculo = vehiculos[i];
            if (vehiculo instanceof Moto) {
                System.out.println("Marca: " + vehiculo.getMarca());
                System.out.println("Modelo: " + vehiculo.getModelo());
                System.out.println("Precio: Bs. " + vehiculo.getPrecio());
                System.out.println("------------------------");
            }
        }
    }
}