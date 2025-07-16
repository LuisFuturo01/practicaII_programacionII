package Composicion._4_;

public class Cliente extends Persona {
    private String tipoCliente;
    private double montoCredito;

    public Cliente(String nombre, String ci, String telefono, String tipoCliente, double montoCredito) {
        super(nombre, ci, telefono);
        this.tipoCliente = tipoCliente;
        this.montoCredito = montoCredito;
    }

    public String getTipoCliente() {return tipoCliente;}
    public double getMontoCredito() {return montoCredito;}
    public void setTipoCliente(String tipoCliente) {this.tipoCliente = tipoCliente;}
    public void setMontoCredito(double montoCredito) {this.montoCredito = montoCredito;}

    public void mostrarCliente() {
        System.out.println("Cliente: " + nombre + " - CI: " + ci + " - Teléfono: " + telefono +
                         " - Tipo: " + tipoCliente + " - Crédito: " + montoCredito);
    }
}