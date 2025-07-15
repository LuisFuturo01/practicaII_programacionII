package Herencia._2_;

public abstract class Animal {
    protected String nombre;
    protected int edad;
    protected String especie;
    
    public Animal(String nombre, int edad, String especie) {
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
    }
    
    public String getNombre() {return nombre;}
    public int getEdad() {return edad;}
    public String getEspecie() {return especie;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setEdad(int edad) {this.edad = edad;}
    public void setEspecie(String especie) {this.especie = especie;}
    
    public abstract String hacerSonido();
}
