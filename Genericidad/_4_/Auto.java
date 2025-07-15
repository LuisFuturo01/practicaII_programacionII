package Genericidad._4_;

public class Auto extends Vehiculo {
    private int numeroPuertas;
    private String tipoCombustible;
    
    public Auto(String marca, String modelo, double precio, int numeroPuertas, String tipoCombustible) {
        super(marca, modelo, precio);
        this.numeroPuertas = numeroPuertas;
        this.tipoCombustible = tipoCombustible;
    }
    
    public int getNumeroPuertas() {return numeroPuertas;}
    public String getTipoCombustible() {return tipoCombustible;}
    public void setNumeroPuertas(int numeroPuertas) {this.numeroPuertas = numeroPuertas;}
    public void setTipoCombustible(String tipoCombustible) {this.tipoCombustible = tipoCombustible;}
    
    @Override
    public void mostrarInfo() {
        System.out.println("Auto: " + marca + " " + modelo + " - " + numeroPuertas + " puertas - " + 
                          tipoCombustible + " - Bs. " + precio);
    }
}
