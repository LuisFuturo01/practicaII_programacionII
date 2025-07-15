package Herencia._1_;

public class ProductoElectrodomestico extends Producto {
    protected double potenciaW;
    protected String marca;
    public ProductoElectrodomestico(String nombre, double precio, double potenciaW, String marca) {
        super(nombre, precio);
        this.potenciaW = potenciaW;
        this.marca = marca;
    }
}
