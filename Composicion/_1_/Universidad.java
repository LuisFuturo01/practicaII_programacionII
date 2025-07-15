package Composicion._1_;

public class Universidad {
    private String nombre;
    private int nEstudiantes;
    private Estudiante[] estudiantes;
    
    public Universidad(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new Estudiante[100];
        this.nEstudiantes = 0;
    }
    
    public void agregarEstudiante(Estudiante estudiante) {
        if (nEstudiantes < 100) {
            estudiantes[nEstudiantes] = estudiante;
            nEstudiantes++;
        }
    }
    
    public void mostrarEstudiantes() {
        System.out.println("Estudiantes de " + nombre + ":");
        for (int i = 0; i < nEstudiantes; i++) {
            System.out.println("- " + estudiantes[i].getNombre() + " (" + estudiantes[i].getCodigo() + ")");
        }
    }
    
    public String getNombre() {return nombre;}
    public Estudiante[] getEstudiantes() {return estudiantes;}
    public int getNEstudiantes() {return nEstudiantes;}
}
