package Genericidad._4_;

public class Moto extends Vehiculo {
    private int cilindrada;
    private String tipoMoto;
    
    public Moto(String marca, String modelo, double precio, int cilindrada, String tipoMoto) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
        this.tipoMoto = tipoMoto;
    }
    
    public int getCilindrada() {return cilindrada;}
    public String getTipoMoto() {return tipoMoto;}
    public void setCilindrada(int cilindrada) {this.cilindrada = cilindrada;}
    public void setTipoMoto(String tipoMoto) {this.tipoMoto = tipoMoto;}
    
    @Override
    public void mostrarInfo() {
        System.out.println("Moto: " + marca + " " + modelo + " - " + cilindrada + "cc - " + 
                          tipoMoto + " - Bs. " + precio);
    }
}
