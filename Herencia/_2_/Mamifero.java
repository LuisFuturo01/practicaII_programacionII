package Herencia._2_;

public abstract class Mamifero extends Animal {
    protected String tipoPelaje;
    protected double peso;
    
    public Mamifero(String nombre, int edad, String especie, String tipoPelaje, double peso) {
        super(nombre, edad, especie);
        this.tipoPelaje = tipoPelaje;
        this.peso = peso;
    }
    
    public String getTipoPelaje() {return tipoPelaje;}
    public double getPeso() {return peso;}
    public void setTipoPelaje(String tipoPelaje) {this.tipoPelaje = tipoPelaje;}
    public void setPeso(double peso) {this.peso = peso;}
    
    public abstract String hacerSonido();
}
