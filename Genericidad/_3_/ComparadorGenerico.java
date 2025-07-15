package Genericidad._3_;

import java.util.Arrays;

public class ComparadorGenerico<T extends Comparable<T>> {
    
    // Determinar cuál objeto es mayor
    public T determinarMayor(T objeto1, T objeto2) {
        int resultado = objeto1.compareTo(objeto2);
        if (resultado > 0) {
            return objeto1;
        } else if (resultado < 0) {
            return objeto2;
        } else {
            return objeto1; // Son iguales, devuelve cualquiera
        }
    }
    
    // Determinar si ambos objetos son iguales
    public boolean sonIguales(T objeto1, T objeto2) {
        return objeto1.compareTo(objeto2) == 0;
    }
    
    // Ordenar un array de objetos de tipo genérico
    public void ordenarArray(T[] array) {
        Arrays.sort(array);
    }
    
    // Método auxiliar para mostrar el resultado de la comparación
    public void compararObjetos(T objeto1, T objeto2) {
        System.out.println("Comparando: " + objeto1 + " vs " + objeto2);
        
        T mayor = determinarMayor(objeto1, objeto2);
        System.out.println("Mayor: " + mayor);
        
        boolean iguales = sonIguales(objeto1, objeto2);
        System.out.println("Son iguales: " + iguales);
        
        System.out.println("---");
    }
}
