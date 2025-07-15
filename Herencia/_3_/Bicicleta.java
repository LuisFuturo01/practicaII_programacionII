package Herencia._3_;

public class Bicicleta extends NoMotorizado {
    private int numeroMarchas;
    
    public Bicicleta(String color, int velocidadMaxima, String tipoFrenos, int numeroMarchas) {
        super(color, velocidadMaxima, tipoFrenos);
        this.numeroMarchas = numeroMarchas;
    }
    
    public int getNumeroMarchas() {return numeroMarchas;}
    public void setNumeroMarchas(int numeroMarchas) {this.numeroMarchas = numeroMarchas;}
    
    public void mostrarDatos() {
        System.out.println("Bicicleta - Color: " + color + ", Velocidad Máxima: " + velocidadMaxima + 
                         ", Frenos: " + tipoFrenos + ", Marchas: " + numeroMarchas);
    }
    
    public boolean mismoTipoFrenos(Bicicleta otra) {
        return this.tipoFrenos.equals(otra.tipoFrenos);
    }
}
