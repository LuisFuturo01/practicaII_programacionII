package Genericidad._5_;

import java.util.ArrayList;
import java.util.List;

public class Repositorio<T> {
    private List<T> items;

    public Repositorio() {
        this.items = new ArrayList<>();
    }

    public void agregar(T item) {
        items.add(item);
        System.out.println("Item agregado al repositorio: " + item.getClass().getSimpleName());
    }

    public boolean eliminar(T item) {
        boolean eliminado = items.remove(item);
        if (eliminado) {
            System.out.println("Item eliminado del repositorio: " + item.getClass().getSimpleName());
        } else {
            System.out.println("Item no encontrado en el repositorio");
        }
        return eliminado;
    }

    public void mostrarTodo() {
        System.out.println("=== CONTENIDO DEL REPOSITORIO ===");
        if (items.isEmpty()) {
            System.out.println("El repositorio está vacío");
        } else {
            for (T item : items) {
                if (item instanceof Publicacion) {
                    ((Publicacion) item).mostrarInfo();
                } else if (item instanceof Autor) {
                    ((Autor) item).mostrarAutor();
                } else {
                    System.out.println(item.toString());
                }
            }
        }
        System.out.println("===============================");
    }

    public List<T> getItems() {
        return items;
    }

    public int size() {
        return items.size();
    }
}