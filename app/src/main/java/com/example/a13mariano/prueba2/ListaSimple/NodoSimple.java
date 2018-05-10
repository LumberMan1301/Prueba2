package com.example.a13mariano.prueba2.ListaSimple;

public class NodoSimple{
    private int data;
    private NodoSimple siguiente;

    public NodoSimple(int data) {
        this.data = data;
        this.siguiente=null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public NodoSimple getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoSimple siguiente) {
        this.siguiente = siguiente;
    }
}
