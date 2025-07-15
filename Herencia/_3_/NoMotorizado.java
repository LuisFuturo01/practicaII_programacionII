package Herencia._3_;

public abstract class NoMotorizado extends Vehiculo {
    protected String tipoFrenos;
    
    public NoMotorizado(String color, int velocidadMaxima, String tipoFrenos) {
        super(color, velocidadMaxima);
        this.tipoFrenos = tipoFrenos;
    }
    
    public String getTipoFrenos() {return tipoFrenos;}
    public void setTipoFrenos(String tipoFrenos) {this.tipoFrenos = tipoFrenos;}
}
