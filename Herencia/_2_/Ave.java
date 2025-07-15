package Herencia._2_;

class Ave extends Animal {
    String tipoDeVuelo;
    public Ave(String nombre, int edad, String especie, String tipoDeVuelo) {
        super(nombre, edad, especie);
        this.tipoDeVuelo = tipoDeVuelo;
    }
    public String getTipoDeVuelo() {return tipoDeVuelo;}    
    public void setTipoDeVuelo(String tipoDeVuelo) {this.tipoDeVuelo = tipoDeVuelo;}
    public void hacerSonido(){
        System.out.println("Cantar");
    }
}
