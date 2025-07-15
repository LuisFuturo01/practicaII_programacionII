package Herencia._3_;

public abstract class Vehiculo {
    protected String color;
    protected int velocidadMaxima;
    
    public Vehiculo(String color, int velocidadMaxima) {
        this.color = color;
        this.velocidadMaxima = velocidadMaxima;
    }
    
    public String getColor() {return color;}
    public int getVelocidadMaxima() {return velocidadMaxima;}
    public void setColor(String color) {this.color = color;}
    public void setVelocidadMaxima(int velocidadMaxima) {this.velocidadMaxima = velocidadMaxima;}
    
    public abstract void mostrarDatos();
}
