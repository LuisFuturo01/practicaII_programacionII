package Herencia._1_;

class Refrigerador extends ProductoElectrodomestico {
    private double capacidadLitros;
    private int claseEnergirgica;
    public Refrigerador(String nombre, double precio, double potenciaW, String marca, double capacidadLitros, int claseEnergirgica) {
        super(nombre, precio, potenciaW, marca);
        this.capacidadLitros = capacidadLitros;
        this.claseEnergirgica = claseEnergirgica;
    }
    public double getCapacidadLitros() {return capacidadLitros;}
    public void setCapacidadLitros(double capacidadLitros) {this.capacidadLitros = capacidadLitros;}
    public int getClaseEnergirgica() {return claseEnergirgica;} 
    public void setClaseEnergirgica(int claseEnergirgica) {this.claseEnergirgica = claseEnergirgica;}

    public void compararCapacidad(Refrigerador otro){
        if(this.capacidadLitros > otro.capacidadLitros) {
            System.out.println("El refrigerador " + this.nombre + " tiene mayor capacidad que " + otro.nombre);
        } else if(this.capacidadLitros < otro.capacidadLitros) {
            System.out.println("El refrigerador " + otro.nombre + " tiene mayor capacidad que " + this.nombre);
        } else {
            System.out.println("Ambos refrigeradores tienen la misma capacidad");
        }
    }
}
