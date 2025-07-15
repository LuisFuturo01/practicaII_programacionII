package Composicion._3_;

public class main {
    public static void main(String[] args) {
        // Crear computadora
        Computadora comp1 = new Computadora("Dell");
        
        // Crear CPUs
        Cpu cpu1 = new Cpu("Intel i7-10700K");
        Cpu cpu2 = new Cpu("AMD Ryzen 5 3600");
        
        // Crear núcleos para CPU1
        Nucleo nucleo1 = new Nucleo(3.8);
        Nucleo nucleo2 = new Nucleo(3.8);
        Nucleo nucleo3 = new Nucleo(3.8);
        Nucleo nucleo4 = new Nucleo(3.8);
        Nucleo nucleo5 = new Nucleo(3.8);
        Nucleo nucleo6 = new Nucleo(3.8);
        Nucleo nucleo7 = new Nucleo(3.8);
        Nucleo nucleo8 = new Nucleo(3.8);
        
        // Agregar núcleos a CPU1
        cpu1.agregarNucleo(nucleo1);
        cpu1.agregarNucleo(nucleo2);
        cpu1.agregarNucleo(nucleo3);
        cpu1.agregarNucleo(nucleo4);
        cpu1.agregarNucleo(nucleo5);
        cpu1.agregarNucleo(nucleo6);
        cpu1.agregarNucleo(nucleo7);
        cpu1.agregarNucleo(nucleo8);
        
        // Crear núcleos para CPU2
        Nucleo nucleo9 = new Nucleo(3.6);
        Nucleo nucleo10 = new Nucleo(3.6);
        Nucleo nucleo11 = new Nucleo(3.6);
        Nucleo nucleo12 = new Nucleo(3.6);
        Nucleo nucleo13 = new Nucleo(3.6);
        Nucleo nucleo14 = new Nucleo(3.6);
        
        // Agregar núcleos a CPU2
        cpu2.agregarNucleo(nucleo9);
        cpu2.agregarNucleo(nucleo10);
        cpu2.agregarNucleo(nucleo11);
        cpu2.agregarNucleo(nucleo12);
        cpu2.agregarNucleo(nucleo13);
        cpu2.agregarNucleo(nucleo14);
        
        // Agregar CPUs a computadora
        comp1.agregarCpu(cpu1);
        comp1.agregarCpu(cpu2);
        
        // Probar métodos
        System.out.println("=== INFORMACIÓN DE LA COMPUTADORA ===");
        System.out.println("Marca: " + comp1.getMarca());
        System.out.println("Número de CPUs: " + comp1.getNroCpu());
        
        System.out.println("\n=== POTENCIA TOTAL ===");
        System.out.println("Potencia total de la computadora: " + comp1.calcularPotenciaTotal() + " GHz");
        
        System.out.println("\n=== VERIFICAR SI ES GAMER ===");
        System.out.println("CPU1 es gamer: " + cpu1.esGamer());
        System.out.println("CPU2 es gamer: " + cpu2.esGamer());
        System.out.println("Computadora es gamer: " + comp1.esGamer());
        
        System.out.println("\n=== COMPARAR VELOCIDADES DE NÚCLEOS ===");
        int comparacion = nucleo1.compararVelocidad(nucleo9);
        if (comparacion > 0) {
            System.out.println("Núcleo 1 es más rápido que Núcleo 9");
        } else if (comparacion < 0) {
            System.out.println("Núcleo 1 es más lento que Núcleo 9");
        } else {
            System.out.println("Núcleo 1 y Núcleo 9 tienen la misma velocidad");
        }
        
        System.out.println("\n=== DETALLES DE CPUs ===");
        System.out.println("CPU1 (" + cpu1.getModelo() + "): " + cpu1.getNroNucleo() + " núcleos, " + 
                         cpu1.calcularVelocidadTotal() + " GHz total");
        System.out.println("CPU2 (" + cpu2.getModelo() + "): " + cpu2.getNroNucleo() + " núcleos, " + 
                         cpu2.calcularVelocidadTotal() + " GHz total");
    }
}
