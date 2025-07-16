package Genericidad._5_;

public class Repositorio<T> {
    private T[] items;
    private int nItems;
    private static final int CAPACITY = 100;

    public Repositorio() {
        this.items = (T[]) new Object[CAPACITY];
        this.nItems = 0;
    }

    public void agregar(T item) {
        if (nItems < CAPACITY) {
            items[nItems++] = item;
            System.out.println("Item agregado al repositorio: " + item.getClass().getSimpleName());
        } else {
            System.out.println("Repositorio lleno, no se puede agregar: " + item.getClass().getSimpleName());
        }
    }

    public boolean eliminar(T item) {
        for (int i = 0; i < nItems; i++) {
            if (items[i] != null && items[i].equals(item)) {
                for (int j = i; j < nItems - 1; j++) {
                    items[j] = items[j + 1];
                }
                items[nItems - 1] = null;
                nItems--;
                System.out.println("Item eliminado del repositorio: " + item.getClass().getSimpleName());
                return true;
            }
        }
        System.out.println("Item no encontrado en el repositorio");
        return false;
    }

    public void mostrarTodo() {
        System.out.println("=== CONTENIDO DEL REPOSITORIO ===");
        if (nItems == 0) {
            System.out.println("El repositorio está vacío");
        } else {
            for (int i = 0; i < nItems; i++) {
                if (items[i] instanceof Publicacion) {
                    ((Publicacion) items[i]).mostrarInfo();
                } else if (items[i] instanceof Autor) {
                    ((Autor) items[i]).mostrarAutor();
                } else {
                    System.out.println(items[i].toString());
                }
            }
        }
        System.out.println("===============================");
    }

    public T[] getItems() {
        return items;
    }

    public int size() {
        return nItems;
    }
}