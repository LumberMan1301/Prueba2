package com.example.a13mariano.prueba2;

import com.example.a13mariano.prueba2.ListaSimple.ListaSimple;

import static com.example.a13mariano.prueba2.Sort.BubbleSort.sort;

public class Main {

    static ListaSimple l = new ListaSimple();

    static String lista;
    static String listaOrdenada;

    public static void main(String[] args) {

        // cantidad de numeros
        int cantidad = (int) (Math.random() * 20) + 20;
        for (int i = 0; i < cantidad; i++) {
            //numero aleatorio
            int num = (int) (Math.random() * 99);
            l.insertar(num);
        }
        lista = l.toString();
        l.imprimirL();

        sort(l);
        listaOrdenada = l.toString();
        l.imprimirL();
    }
}

