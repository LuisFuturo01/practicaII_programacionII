package Genericidad._2_;

public class MaximoGenerico {
    
    // Método genérico para encontrar el máximo de 3 elementos
    public static <T extends Comparable<T>> T encontrarMaximo(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }
    
    // Método específico para String que compara por longitud
    public static String encontrarMaximoPorLongitud(String a, String b, String c) {
        String max = a;
        if (b.length() > max.length()) {
            max = b;
        }
        if (c.length() > max.length()) {
            max = c;
        }
        return max;
    }
}
