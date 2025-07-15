package Genericidad._2_;

public class Main {
    public static void main(String[] args) {
        // Ejemplo con números enteros
        System.out.println("=== MÁXIMO DE ENTEROS ===");
        Integer maxInt = MaximoGenerico.encontrarMaximo(5, 12, 8);
        System.out.println("Máximo entre 5, 12, 8: " + maxInt);
        
        // Ejemplo con números decimales
        System.out.println("\n=== MÁXIMO DE DECIMALES ===");
        Double maxDouble = MaximoGenerico.encontrarMaximo(3.14, 2.71, 1.41);
        System.out.println("Máximo entre 3.14, 2.71, 1.41: " + maxDouble);
        
        // Ejemplo con strings (orden lexicográfico)
        System.out.println("\n=== MÁXIMO DE STRINGS (LEXICOGRÁFICO) ===");
        String maxString = MaximoGenerico.encontrarMaximo("banana", "manzana", "pera");
        System.out.println("Máximo entre banana, manzana, pera: " + maxString);
        
        // Ejemplo con strings por longitud (como pide el ejercicio)
        System.out.println("\n=== MÁXIMO DE STRINGS POR LONGITUD ===");
        String maxPorLongitud = MaximoGenerico.encontrarMaximoPorLongitud("manzana", "pera", "limón");
        System.out.println("Máximo por longitud entre manzana, pera, limón: " + maxPorLongitud);
        
        // Ejemplo con caracteres
        System.out.println("\n=== MÁXIMO DE CARACTERES ===");
        Character maxChar = MaximoGenerico.encontrarMaximo('a', 'z', 'm');
        System.out.println("Máximo entre 'a', 'z', 'm': " + maxChar);
        
        // Ejemplo adicional con frutas por longitud
        System.out.println("\n=== EJEMPLO DEL EJERCICIO: FRUTAS POR LONGITUD ===");
        String fruta1 = "manzana";
        String fruta2 = "pera";
        String fruta3 = "limón";
        String maxFruta = MaximoGenerico.encontrarMaximoPorLongitud(fruta1, fruta2, fruta3);
        System.out.println("Entre " + fruta1 + " (" + fruta1.length() + " caracteres), " + 
                          fruta2 + " (" + fruta2.length() + " caracteres), " + 
                          fruta3 + " (" + fruta3.length() + " caracteres)");
        System.out.println("El máximo por número de caracteres es: " + maxFruta);
    }
}
