package Herencia._2_;

public class Perro extends Mamifero {
    private String raza;
    
    public Perro(String nombre, int edad, String especie, String tipoPelaje, double peso, String raza) {
        super(nombre, edad, especie, tipoPelaje, peso);
        this.raza = raza;
    }
    
    public String getRaza() {return raza;}
    public void setRaza(String raza) {this.raza = raza;}
    
    public String hacerSonido() {
        return "Ladrar";
    }
}
