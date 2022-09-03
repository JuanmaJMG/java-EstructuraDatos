package Estructuras;

import Nodos.NodoSimple;

public class ListaSimple {

    NodoSimple primero;

    public ListaSimple() {
        this.primero = null;
    }

    public void insertar(NodoSimple nuevo) {
        if (nada()) {
            primero = nuevo;
        } else {
            NodoSimple aux = primero;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }
    public void imprimir() {
        if (nada()) {
            System.out.println("Lista Vacia");
            return;
        }
        NodoSimple aux = primero;
        while (aux != null) {
            System.out.println(aux.getNum());
            aux = aux.getSiguiente();
        }
    }
    public boolean nada() {
        return primero == null;
    }
}
