package Herencia._3_;

public class Auto extends Motorizado {
    private int numeroPuertas;
    
    public Auto(String color, int velocidadMaxima, String tipoCombustible, int numeroPuertas) {
        super(color, velocidadMaxima, tipoCombustible);
        this.numeroPuertas = numeroPuertas;
    }
    
    public int getNumeroPuertas() {return numeroPuertas;}
    public void setNumeroPuertas(int numeroPuertas) {this.numeroPuertas = numeroPuertas;}
    
    public void mostrarDatos() {
        System.out.println("Auto - Color: " + color + ", Velocidad Máxima: " + velocidadMaxima + 
                         ", Combustible: " + tipoCombustible + ", Puertas: " + numeroPuertas);
    }
}
