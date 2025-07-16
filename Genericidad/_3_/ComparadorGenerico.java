package Genericidad._3_;

import java.util.Arrays;

public class ComparadorGenerico<T extends Comparable<T>> {

    public T determinarMayor(T objeto1, T objeto2) {
        int resultado = objeto1.compareTo(objeto2);
        if (resultado > 0) {
            return objeto1;
        } else if (resultado < 0) {
            return objeto2;
        } else {
            return objeto1;
        }
    }

    public boolean sonIguales(T objeto1, T objeto2) {
        return objeto1.compareTo(objeto2) == 0;
    }

    public void ordenarArray(T[] array) {
        Arrays.sort(array);
    }

    public void compararObjetos(T objeto1, T objeto2) {
        System.out.println("Comparando: " + objeto1 + " vs " + objeto2);

        T mayor = determinarMayor(objeto1, objeto2);
        System.out.println("Mayor: " + mayor);

        boolean iguales = sonIguales(objeto1, objeto2);
        System.out.println("Son iguales: " + iguales);

        System.out.println("---");
    }
}