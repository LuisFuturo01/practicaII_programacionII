package Herencia._2_;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // a) Crear al menos 3 objetos de cada tipo de animal
        Perro perro1 = new Perro("Max", 4, "Canino", "Largo", 22.0, "Golden Retriever");
        Perro perro2 = new Perro("Buddy", 3, "Canino", "Medio", 18.0, "Beagle");
        Perro perro3 = new Perro("Rocky", 6, "Canino", "Corto", 25.0, "Bulldog");
        
        Murcielago murcielago1 = new Murcielago("Batman", 2, "Quiróptero", "Corto", 0.5, 50, true);
        Murcielago murcielago2 = new Murcielago("Dracula", 3, "Quiróptero", "Corto", 0.6, 70, true);
        Murcielago murcielago3 = new Murcielago("Noctulo", 1, "Quiróptero", "Corto", 0.4, 40, true);
        
        Ave ave1 = new Ave("Tweety", 2, "Canario", "Planeador");
        Ave ave2 = new Ave("Polly", 5, "Loro", "Planeador");
        Ave ave3 = new Ave("Pico", 1, "Colibrí", "Colibrí");
        
        // b) Implementar nueva clase Reptil
        Reptil reptil1 = new Reptil("Serpiente", 3, "Serpiente", "Lisas");
        Reptil reptil2 = new Reptil("Iguana", 2, "Lagarto", "Rugosas");
        Reptil reptil3 = new Reptil("Gecko", 1, "Lagarto", "Granulares");
        
        // Crear array de animales
        Animal[] animales = new Animal[12];
        animales[0] = perro1;
        animales[1] = perro2;
        animales[2] = perro3;
        animales[3] = murcielago1;
        animales[4] = murcielago2;
        animales[5] = murcielago3;
        animales[6] = ave1;
        animales[7] = ave2;
        animales[8] = ave3;
        animales[9] = reptil1;
        animales[10] = reptil2;
        animales[11] = reptil3;
        
        // c) Mostrar todos los animales
        System.out.println("=== TODOS LOS ANIMALES ===");
        for (int i = 0; i < animales.length; i++) {
            System.out.println("Nombre: " + animales[i].getNombre() + ", Especie: " + animales[i].getEspecie() + 
                             ", Sonido: " + animales[i].hacerSonido());
        }
        
        // d) Agrupar animales por especie (usando arrays simples)
        System.out.println("\n=== AGRUPACIÓN POR ESPECIE ===");
        
        // Crear arrays para especies únicas y sus conteos
        String[] especiesUnicas = new String[10]; // máximo 10 especies diferentes
        int[] conteoEspecies = new int[10];
        int numEspecies = 0;
        
        // Contar especies
        for (int i = 0; i < animales.length; i++) {
            String especieActual = animales[i].getEspecie();
            boolean encontrada = false;
            
            // Buscar si la especie ya existe
            for (int j = 0; j < numEspecies; j++) {
                if (especiesUnicas[j].equals(especieActual)) {
                    conteoEspecies[j]++;
                    encontrada = true;
                    break;
                }
            }
            
            // Si no existe, agregarla
            if (!encontrada) {
                especiesUnicas[numEspecies] = especieActual;
                conteoEspecies[numEspecies] = 1;
                numEspecies++;
            }
        }
        
        // Mostrar resultados
        for (int i = 0; i < numEspecies; i++) {
            System.out.println("Especie: " + especiesUnicas[i] + ", Cantidad: " + conteoEspecies[i]);
        }
        
        // Comparar alcance de vuelo de murciélagos
        System.out.println("\n=== COMPARACIÓN DE ALCANCE DE VUELO ===");
        murcielago1.comparaAlcanceVuelo(murcielago2);
        murcielago2.comparaAlcanceVuelo(murcielago3);
        
        // Opción adicional: buscar animal por nombre
        System.out.println("\n=== BUSCAR ANIMAL POR NOMBRE ===");
        System.out.print("Ingrese el nombre del animal a buscar: ");
        String nombreBuscar = scanner.nextLine();
        
        boolean encontrado = false;
        for (int i = 0; i < animales.length; i++) {
            if (animales[i].getNombre().equalsIgnoreCase(nombreBuscar)) {
                System.out.println("Animal encontrado:");
                System.out.println("Nombre: " + animales[i].getNombre() + 
                                 ", Especie: " + animales[i].getEspecie() + 
                                 ", Edad: " + animales[i].getEdad() + 
                                 ", Sonido: " + animales[i].hacerSonido());
                encontrado = true;
                break;
            }
        }
        
        if (!encontrado) {
            System.out.println("Animal no encontrado.");
        }
        
        scanner.close();
    }
}
