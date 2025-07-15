package Composicion._3_;

public class Cpu {
    private String modelo;
    private int nroNucleo;
    private Nucleo[] nuc;
    
    public Cpu(String modelo) {
        this.modelo = modelo;
        this.nuc = new Nucleo[10];
        this.nroNucleo = 0;
    }
    
    public void agregarNucleo(Nucleo nucleo) {
        if (nroNucleo < 10) {
            nuc[nroNucleo] = nucleo;
            nroNucleo++;
        }
    }
    
    public double calcularVelocidadTotal() {
        double total = 0;
        for (int i = 0; i < nroNucleo; i++) {
            total += nuc[i].getVelocidad();
        }
        return total;
    }
    
    public boolean esGamer() {
        // Un CPU gamer tiene al menos 4 núcleos y cada núcleo > 2.5 GHz
        if (nroNucleo < 4) return false;
        for (int i = 0; i < nroNucleo; i++) {
            if (nuc[i].getVelocidad() < 2.5) {
                return false;
            }
        }
        return true;
    }
    
    public String getModelo() {return modelo;}
    public int getNroNucleo() {return nroNucleo;}
    public Nucleo[] getNuc() {return nuc;}
    public void setModelo(String modelo) {this.modelo = modelo;}
}
