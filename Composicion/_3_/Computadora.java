package Composicion._3_;

public class Computadora {
    private String marca;
    private int nroCpu;
    private Cpu[] cpu;
    
    public Computadora(String marca) {
        this.marca = marca;
        this.cpu = new Cpu[10];
        this.nroCpu = 0;
    }
    
    public void agregarCpu(Cpu procesador) {
        if (nroCpu < 10) {
            cpu[nroCpu] = procesador;
            nroCpu++;
        }
    }
    
    public double calcularPotenciaTotal() {
        double total = 0;
        for (int i = 0; i < nroCpu; i++) {
            total += cpu[i].calcularVelocidadTotal();
        }
        return total;
    }
    
    public boolean esGamer() {
        // Una computadora gamer tiene al menos 1 CPU gamer
        for (int i = 0; i < nroCpu; i++) {
            if (cpu[i].esGamer()) {
                return true;
            }
        }
        return false;
    }
    
    public String getMarca() {return marca;}
    public int getNroCpu() {return nroCpu;}
    public Cpu[] getCpu() {return cpu;}
    public void setMarca(String marca) {this.marca = marca;}
}
