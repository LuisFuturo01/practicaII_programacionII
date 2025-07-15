package Herencia._3_;

public class Tren extends Motorizado {
    private int numeroVagones;
    
    public Tren(String color, int velocidadMaxima, String tipoCombustible, int numeroVagones) {
        super(color, velocidadMaxima, tipoCombustible);
        this.numeroVagones = numeroVagones;
    }
    
    public int getNumeroVagones() {return numeroVagones;}
    public void setNumeroVagones(int numeroVagones) {this.numeroVagones = numeroVagones;}
    
    public void mostrarDatos() {
        System.out.println("Tren - Color: " + color + ", Velocidad Máxima: " + velocidadMaxima + 
                         ", Combustible: " + tipoCombustible + ", Vagones: " + numeroVagones);
    }
}
