class ListaEnlazada {
    Nodo cabeza;

    public ListaEnlazada() {
        this.cabeza = null;
    }

    // Método para buscar un nodo por el valor de su campo num y devolver una
    // referencia
    public Nodo buscarPornum(int num) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.num == num) {
                return actual;
            }
            actual = actual.siguiente;
        }
        return null;
    }

    // Método para buscar un nodo por su campo num e insertar un nuevo nodo después
    // de él
    public void insertarDespuesDenum(int numBuscar, int nuevanum) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.num == numBuscar) {
                Nodo nuevoNodo = new Nodo(nuevanum);
                nuevoNodo.siguiente = actual.siguiente;
                actual.siguiente = nuevoNodo;
                return;
            }
            actual = actual.siguiente;
        }
    }

    // Método para intercambiar un nodo por otro
    public void intercambiarNodos(int num1, int num2) {
        if (num1 == num2) {
            return;
        }

        // Encuentra los nodos especificados
        Nodo anterior1 = null, actual1 = cabeza;
        while (actual1 != null && actual1.num != num1) {
            anterior1 = actual1;
            actual1 = actual1.siguiente;
        }
        Nodo anterior2 = null, actual2 = cabeza;
        while (actual2 != null && actual2.num != num2) {
            anterior2 = actual2;
            actual2 = actual2.siguiente;
        }
        if (actual1 == null || actual2 == null) {
            return;
        }

        // Intercambio de nodos
        if (anterior1 != null) {
            anterior1.siguiente = actual2;
        } else {
            cabeza = actual2;
        }

        if (anterior2 != null) {
            anterior2.siguiente = actual1;
        } else {
            cabeza = actual1;
        }

        Nodo temp = actual1.siguiente;
        actual1.siguiente = actual2.siguiente;
        actual2.siguiente = temp;
    }
}