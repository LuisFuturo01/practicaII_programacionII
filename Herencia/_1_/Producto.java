package Herencia._1_;
public class Producto {
    protected String nombre;
    protected double precio;
    Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    public String getNombre() {return nombre;}
    public double getPrecio() {return precio;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setPrecio(double precio) {this.precio = precio;}
}
