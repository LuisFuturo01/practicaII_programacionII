package Herencia._3_;

public abstract class Motorizado extends Vehiculo {
    protected String tipoCombustible;
    
    public Motorizado(String color, int velocidadMaxima, String tipoCombustible) {
        super(color, velocidadMaxima);
        this.tipoCombustible = tipoCombustible;
    }
    
    public String getTipoCombustible() {return tipoCombustible;}
    public void setTipoCombustible(String tipoCombustible) {this.tipoCombustible = tipoCombustible;}
}
