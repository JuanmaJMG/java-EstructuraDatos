package Main;

import Estructuras.ListaSimple;
import Nodos.NodoSimple;

public class Main {
    public static void main(String[] args) {
        ListaSimple Lista = new ListaSimple();
        System.out.println("Agregue tres cuatro nodos");
        NodoSimple nuevo = new NodoSimple(1, "UNO");
        Lista.insertar(nuevo);
        nuevo = new NodoSimple(2, "DOS");
        Lista.insertar(nuevo);
        nuevo = new NodoSimple(3, "TRES");
        Lista.insertar(nuevo);
        nuevo = new NodoSimple(4, "CUATRO");
        Lista.insertar(nuevo);
        Lista.imprimir();
    }
}
