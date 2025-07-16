package Genericidad._2_;

public class MaximoGenerico {
    
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
