package Genericidad._1_;

public class Par<T1, T2> {
    private T1 primero;
    private T2 segundo;
    
    public Par(T1 primero, T2 segundo) {
        this.primero = primero;
        this.segundo = segundo;
    }
    
    public T1 getPrimero() {return primero;}
    public T2 getSegundo() {return segundo;}
    public void setPrimero(T1 primero) {this.primero = primero;}
    public void setSegundo(T2 segundo) {this.segundo = segundo;}
    
    public void mostrar() {
        System.out.println("Par: [" + primero + ", " + segundo + "]");
    }
    
    public boolean sonIguales() {
        if (primero == null && segundo == null) return true;
        if (primero == null || segundo == null) return false;
        return primero.equals(segundo);
    }
    
    public boolean tienenTiposIguales() {
        if (primero == null && segundo == null) return true;
        if (primero == null || segundo == null) return false;
        return primero.getClass().equals(segundo.getClass());
    }
}
