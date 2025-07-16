package Genericidad._3_;

public class Main {
    public static void main(String[] args) {
        ComparadorGenerico<Integer> comparadorInt = new ComparadorGenerico<>();

        System.out.println("=== COMPARACIÓN DE ENTEROS ===");
        comparadorInt.compararObjetos(15, 25);
        comparadorInt.compararObjetos(100, 50);
        comparadorInt.compararObjetos(7, 7);

        ComparadorGenerico<String> comparadorString = new ComparadorGenerico<>();

        System.out.println("\n=== COMPARACIÓN DE STRINGS ===");
        comparadorString.compararObjetos("banana", "manzana");
        comparadorString.compararObjetos("zebra", "abeja");
        comparadorString.compararObjetos("igual", "igual");

        ComparadorGenerico<Persona> comparadorPersona = new ComparadorGenerico<>();

        Persona persona1 = new Persona("Juan", 25);
        Persona persona2 = new Persona("María", 30);
        Persona persona3 = new Persona("Pedro", 25);

        System.out.println("\n=== COMPARACIÓN DE PERSONAS ===");
        comparadorPersona.compararObjetos(persona1, persona2);
        comparadorPersona.compararObjetos(persona2, persona1);
        comparadorPersona.compararObjetos(persona1, persona3);

        System.out.println("\n=== ORDENAMIENTO DE ARRAYS ===");

        Integer[] numeros = {5, 2, 8, 1, 9, 3};
        System.out.println("Array de enteros antes de ordenar: " + java.util.Arrays.toString(numeros));
        comparadorInt.ordenarArray(numeros);
        System.out.println("Array de enteros después de ordenar: " + java.util.Arrays.toString(numeros));

        String[] palabras = {"zebra", "abeja", "casa", "dado", "elefante"};
        System.out.println("\nArray de strings antes de ordenar: " + java.util.Arrays.toString(palabras));
        comparadorString.ordenarArray(palabras);
        System.out.println("Array de strings después de ordenar: " + java.util.Arrays.toString(palabras));

        Persona[] personas = {
            new Persona("Carlos", 35),
            new Persona("Ana", 22),
            new Persona("Luis", 28),
            new Persona("Sofia", 19)
        };
        System.out.println("\nArray de personas antes de ordenar: " + java.util.Arrays.toString(personas));
        comparadorPersona.ordenarArray(personas);
        System.out.println("Array de personas después de ordenar: " + java.util.Arrays.toString(personas));
    }
}