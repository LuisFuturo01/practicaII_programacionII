package Genericidad._4_;

public abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected double precio;
    
    public Vehiculo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    
    public String getMarca() {return marca;}
    public String getModelo() {return modelo;}
    public double getPrecio() {return precio;}
    public void setMarca(String marca) {this.marca = marca;}
    public void setModelo(String modelo) {this.modelo = modelo;}
    public void setPrecio(double precio) {this.precio = precio;}
    
    public abstract void mostrarInfo();
    
    @Override
    public String toString() {
        return marca + " " + modelo + " - Bs. " + precio;
    }
}
