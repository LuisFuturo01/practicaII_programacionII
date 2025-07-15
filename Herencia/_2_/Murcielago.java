package Herencia._2_;

public class Murcielago extends Mamifero {
    private int alcanceVueloKm;
    private boolean activoNoche;
    
    public Murcielago(String nombre, int edad, String especie, String tipoPelaje, double peso, int alcanceVueloKm, boolean activoNoche) {
        super(nombre, edad, especie, tipoPelaje, peso);
        this.alcanceVueloKm = alcanceVueloKm;
        this.activoNoche = activoNoche;
    }
    
    public int getAlcanceVueloKm() {return alcanceVueloKm;}
    public void setAlcanceVueloKm(int alcanceVueloKm) {this.alcanceVueloKm = alcanceVueloKm;}
    public boolean isActivoNoche() {return activoNoche;}
    public void setActivoNoche(boolean activoNoche) {this.activoNoche = activoNoche;}
    
    public String hacerSonido() {
        return "Chillido";
    }
    
    public void comparaAlcanceVuelo(Murcielago otro) {
        if (this.alcanceVueloKm > otro.alcanceVueloKm) {
            System.out.println(this.nombre + " vuela más lejos que " + otro.nombre);
        } else if (this.alcanceVueloKm < otro.alcanceVueloKm) {
            System.out.println(this.nombre + " vuela menos lejos que " + otro.nombre);
        } else {
            System.out.println(this.nombre + " y " + otro.nombre + " tienen el mismo alcance de vuelo");
        }
    }
}
