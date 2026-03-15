public class ListaEnlazadasimple {
    // Referencia al primer nodo (cabeza) de la lista
    private NODO cabeza;

    // Clase interna que representa un nodo
    private static class NODO {
        int dato;       // Valor entero almacenado
        NODO enlace;    // Referencia al siguiente nodo

        // Constructor del nodo
        NODO(int dato) {
            this.dato = dato;
            this.enlace = null;
        }
    }

    // Constructor de la lista (inicialmente vacía)
    public ListaEnlazadasimple() {
        cabeza = null;
    }

    // Método para insertar un elemento al final de la lista
    public void insertar(int dato) {
        NODO nuevo = new NODO(dato);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            NODO actual = cabeza;
            while (actual.enlace != null) {
                actual = actual.enlace;  // Sin casting
            }
            actual.enlace = nuevo;
        }
    }

    // Método para eliminar la primera ocurrencia de un dato
    public void eliminar(int dato) {
        if (cabeza == null) return;

        if (cabeza.dato == dato) {
            cabeza = cabeza.enlace;  // Sin casting
            return;
        }

        NODO anterior = cabeza;
        while (anterior.enlace != null && anterior.enlace.dato != dato) {
            anterior = anterior.enlace;  // Sin casting
        }

        if (anterior.enlace != null) {
            anterior.enlace = anterior.enlace.enlace;
        }
    }

    // Método para buscar un dato en la lista
    public boolean buscar(int dato) {
        NODO actual = cabeza;
        while (actual != null) {
            if (actual.dato == dato) return true;
            actual = actual.enlace;  // Sin casting
        }
        return false;
    }

    // Método para mostrar todos los elementos de la lista
    public void mostrar() {
        if (cabeza == null) {
            System.out.println("La lista está vacía");
            return;
        }
        NODO actual = cabeza;
        System.out.print("cabeza -> ");
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.enlace;  // Sin casting
        }
        System.out.println("null");
    }

    // Método para obtener el tamaño de la lista
    public int tamanio() {
        int contador = 0;
        NODO actual = cabeza;
        while (actual != null) {
            contador++;
            actual = actual.enlace;  // Sin casting
        }
        return contador;
    }
}