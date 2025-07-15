package Composicion._4_;

public class Persona {
    protected String nombre;
    protected String ci;
    protected String telefono;
    
    public Persona(String nombre, String ci, String telefono) {
        this.nombre = nombre;
        this.ci = ci;
        this.telefono = telefono;
    }
    
    public String getNombre() {return nombre;}
    public String getCi() {return ci;}
    public String getTelefono() {return telefono;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setCi(String ci) {this.ci = ci;}
    public void setTelefono(String telefono) {this.telefono = telefono;}
}
