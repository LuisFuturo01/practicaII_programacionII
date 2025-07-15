package Herencia._1_;

public class main {
    public static void main(String[] args) {
        ProductoAlimenticio producto = new ProductoAlimenticio("Manzana", 1.5, "2025-12-31", 52);
        producto.diasRestantesVencimiento("2025-07-15");
        producto.caloriasInfo();
        Refrigerador refrigerador1 = new Refrigerador("Refrigerador A", 500.0, 150.0, "Samsung", 300.0, 1);
        Refrigerador refrigerador2 = new Refrigerador("Refrigerador B", 600.0, 200.0, "LG", 350.0, 2);
        refrigerador1.compararCapacidad(refrigerador2);
    }
}
