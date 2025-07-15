package Herencia._2_;

public class Ave extends Animal {
    protected String tipoDeVuelo;
    
    public Ave(String nombre, int edad, String especie, String tipoDeVuelo) {
        super(nombre, edad, especie);
        this.tipoDeVuelo = tipoDeVuelo;
    }
    
    public String getTipoDeVuelo() {return tipoDeVuelo;}
    public void setTipoDeVuelo(String tipoDeVuelo) {this.tipoDeVuelo = tipoDeVuelo;}
    
    public String hacerSonido() {
        return "Cantar";
    }
}
