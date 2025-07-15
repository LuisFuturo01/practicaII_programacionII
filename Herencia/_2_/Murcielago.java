package Herencia._2_;

public class Murcielago extends Ave {
    private int alcanceVueloKm;
    private boolean activoNoche;
    public Murcielago(String nombre, int edad, String especie, String tipoDeVuelo, int alcanceVueloKm, boolean activoNoche) {
        super(nombre, edad, especie, tipoDeVuelo);
        this.alcanceVueloKm = alcanceVueloKm;
        this.activoNoche = activoNoche;
    }
    public int getAlcanceVueloKm() {return alcanceVueloKm;}
    public void setAlcanceVueloKm(int alcanceVueloKm) {this.alcanceVueloKm = alcanceVueloKm;}
    public boolean isActivoNoche() {return activoNoche;}
    public void setActivoNoche(boolean activoNoche) {this.activoNoche = activoNoche;}
    public void comparaAlcanceVuelo(Murcielago otro){
        if (this.alcanceVueloKm > otro.alcanceVueloKm) {
            System.out.println(this.getNombre() + " vuela más lejos que " + otro.getNombre());
        } else if (this.alcanceVueloKm < otro.alcanceVueloKm) {
            System.out.println(this.getNombre() + " vuela menos lejos que " + otro.getNombre());
        } else {
            System.out.println(this.getNombre() + " y " + otro.getNombre() + " tienen el mismo alcance de vuelo");
        }
    }

    
}
