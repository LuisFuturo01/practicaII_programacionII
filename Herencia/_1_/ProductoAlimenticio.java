package Herencia._1_;

public class ProductoAlimenticio extends Producto{
    private String fechaVencimiento;
    private double calorias;
    public ProductoAlimenticio(String nombre, double precio, String fechaVencimiento, double calorias) {
        super(nombre, precio);
        this.fechaVencimiento = fechaVencimiento;
        this.calorias = calorias;
    }
    public String getFechaVencimiento() {return fechaVencimiento;}
    public void setFechaVencimiento(String fechaVencimiento) {this.fechaVencimiento = fechaVencimiento;}
    public double getCalorias() {return calorias;}
    public void setCalorias(double calorias) {this.calorias = calorias;}
    public void diasRestantesVencimiento(String fechaActual){
        String[] fechaActualPartes = fechaActual.split("-");
        String[] fechaVencimientoPartes = this.fechaVencimiento.split("-");
        int diaActual = Integer.parseInt(fechaActualPartes[0]);
        int mesActual = Integer.parseInt(fechaActualPartes[1]);
        int anioActual = Integer.parseInt(fechaActualPartes[2]);
        int diaVencimiento = Integer.parseInt(fechaVencimientoPartes[0]);
        int mesVencimiento = Integer.parseInt(fechaVencimientoPartes[1]);
        int anioVencimiento = Integer.parseInt(fechaVencimientoPartes[2]);
        int diasRestantes = (anioVencimiento - anioActual) * 365 + (mesVencimiento - mesActual) * 30 + (diaVencimiento - diaActual);
        System.out.println(diasRestantes + " días restantes para el vencimiento del producto " + this.nombre);
    }
    public void caloriasInfo(){
        if(this.calorias<100) System.out.println("El producto " + this.nombre + " es saludable con " + this.calorias + " calorias");
        else System.out.println("El producto " + this.nombre + " no es saludable con " + this.calorias + " calorias");
    }
    
}
