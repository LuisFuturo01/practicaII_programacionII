package Genericidad._1_;

public class Main {
    public static void main(String[] args) {
        // Crear pares de diferentes tipos
        Par<String, Integer> par1 = new Par<>("Hola", 42);
        Par<Integer, Integer> par2 = new Par<>(10, 10);
        Par<String, String> par3 = new Par<>("Mundo", "Mundo");
        Par<Double, Float> par4 = new Par<>(3.14, 2.71f);
        
        System.out.println("=== MOSTRANDO PARES ===");
        par1.mostrar();
        par2.mostrar();
        par3.mostrar();
        par4.mostrar();
        
        System.out.println("\n=== VERIFICANDO SI SON IGUALES ===");
        System.out.println("Par1 son iguales: " + par1.sonIguales());
        System.out.println("Par2 son iguales: " + par2.sonIguales());
        System.out.println("Par3 son iguales: " + par3.sonIguales());
        System.out.println("Par4 son iguales: " + par4.sonIguales());
        
        System.out.println("\n=== VERIFICANDO SI TIENEN TIPOS IGUALES ===");
        System.out.println("Par1 tipos iguales: " + par1.tienenTiposIguales());
        System.out.println("Par2 tipos iguales: " + par2.tienenTiposIguales());
        System.out.println("Par3 tipos iguales: " + par3.tienenTiposIguales());
        System.out.println("Par4 tipos iguales: " + par4.tienenTiposIguales());
        
        // Ejemplo con nulls
        Par<String, String> par5 = new Par<>(null, null);
        System.out.println("\n=== PAR CON NULLS ===");
        par5.mostrar();
        System.out.println("Par5 son iguales: " + par5.sonIguales());
        System.out.println("Par5 tipos iguales: " + par5.tienenTiposIguales());
    }
}
