public class usoLista {
    public static void main(String[] args) {
        ListaEnlazada listaEnlazada = new ListaEnlazada();

        // Agg nodos
        listaEnlazada.cabeza = new Nodo(1);
        listaEnlazada.cabeza.siguiente = new Nodo(2);
        listaEnlazada.cabeza.siguiente.siguiente = new Nodo(3);
        listaEnlazada.cabeza.siguiente.siguiente.siguiente = new Nodo(4);
        // Busca un nodo por el valor de su campo
        int numBuscar = 3;
        Nodo nodoBuscado = listaEnlazada.buscarPornum(numBuscar);
        if (nodoBuscado != null) {
            System.out.println("Nodo con num " + numBuscar + " encontrado.");
        } else {
            System.out.println("Nodo con num " + numBuscar + " no encontrado.");
        }
        // Buscar un nodo por su campo num e insertar un nuevo nodo después de él
        int numInsertarDespues = 2;
        int nuevanum = 5;
        listaEnlazada.insertarDespuesDenum(numInsertarDespues, nuevanum);
        System.out.println("Lista enlazada después de la inserción:");
        imprimirListaEnlazada(listaEnlazada);
        int numIntercambiar1 = 2;
        int numIntercambiar2 = 4;
        listaEnlazada.intercambiarNodos(numIntercambiar1, numIntercambiar2);
        // Impresion
        System.out.println("Lista enlazada después del intercambio:");
        imprimirListaEnlazada(listaEnlazada);
    }

    private static void imprimirListaEnlazada(ListaEnlazada lista) {
        Nodo actual = lista.cabeza;
        while (actual != null) {
            System.out.print(actual.num + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
}
