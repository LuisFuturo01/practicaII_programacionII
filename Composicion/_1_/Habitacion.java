package Composicion._1_;

public class Habitacion {
    private String tipo;
    private double area;
    
    public Habitacion(String tipo, double area) {
        this.tipo = tipo;
        this.area = area;
    }
    
    public String getTipo() {return tipo;}
    public double getArea() {return area;}
    public void setTipo(String tipo) {this.tipo = tipo;}
    public void setArea(double area) {this.area = area;}
}
