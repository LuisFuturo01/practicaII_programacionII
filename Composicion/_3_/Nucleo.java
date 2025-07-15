package Composicion._3_;

public class Nucleo {
    private double velocidad;
    
    public Nucleo(double velocidad) {
        this.velocidad = velocidad;
    }
    
    public double getVelocidad() {return velocidad;}
    public void setVelocidad(double velocidad) {this.velocidad = velocidad;}
    
    public int compararVelocidad(Nucleo otro) {
        if (this.velocidad > otro.velocidad) return 1;
        if (this.velocidad < otro.velocidad) return -1;
        return 0;
    }
}
