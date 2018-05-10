package com.example.a13mariano.prueba2.ListaSimple;

/**
 * Clase del nodo simple de nuestra lista
 */
public class NodoSimple{
    private int data;
    private NodoSimple siguiente;

    /**
     * Constructor de la clase
     * @param data valor almacenado en el nodo
     */
    public NodoSimple(int data) {
        this.data = data;
        this.siguiente=null;
    }

    /**
     *
     * @return dato almacenado en el nodo
     */
    public int getData() {
        return data;
    }

    /**
     *
     * @param data valor que se quiere asignar al nodo
     */
    public void setData(int data) {
        this.data = data;
    }

    /**
     *
     * @return valor siguiente al nodo
     */
    public NodoSimple getSiguiente() {
        return siguiente;
    }

    /**
     *
     * @param siguiente modifica el valor del nodo siguiente
     */
    public void setSiguiente(NodoSimple siguiente) {
        this.siguiente = siguiente;
    }
}
