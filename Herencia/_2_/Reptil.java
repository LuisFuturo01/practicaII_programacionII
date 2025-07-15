package Herencia._2_;

public class Reptil extends Animal {
    private String tipoEscamas;
    
    public Reptil(String nombre, int edad, String especie, String tipoEscamas) {
        super(nombre, edad, especie);
        this.tipoEscamas = tipoEscamas;
    }
    
    public String getTipoEscamas() {return tipoEscamas;}
    public void setTipoEscamas(String tipoEscamas) {this.tipoEscamas = tipoEscamas;}
    
    public String hacerSonido() {
        return "Sisear";
    }
}
