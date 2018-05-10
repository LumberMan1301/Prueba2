package com.example.a13mariano.prueba2.Sort;

import com.example.a13mariano.prueba2.BubbleSortAct;
import com.example.a13mariano.prueba2.ListaSimple.ListaSimple;

public class BubbleSort {


    private static int comparaciones=0;
    /**
     * Crea una copia de la lista, y llama al metodo privado para recursividad
     * @param lista para trabaja con una copia de la lista
     */
    public static void sort(ListaSimple lista)

    {
        ListaSimple list = lista;
        BubbleSortAuxiliar(list, lista.getCapacidad() - 1);
    }

    /**
     * Código para mostrar paso a paso el ordenamiento
     * @param list lista de la que se quiere conseguir los pasos a efectuar
     * @param amount 
     */
    private static void BubbleSortAuxiliar(ListaSimple list, int amount){

        for (int out = amount; out > 0; out--) {
            for (int in = 0; in < out; in++) {
                comparaciones++;
                if ((list.get(in)) < (list.get(in + 1))) {
                    list.swap(in, in + 1);
                    System.out.print(comparaciones);
                    list.imprimirL();
                    BubbleSortAct.getTextPaso().append((CharSequence) list.meterLista());

                }
            }
        }
    }

    /**
     * Retorna el número de comparaciones realizadas
     * @return número de comparaciones
     */
    public static int getComparaciones() {
        return comparaciones;
    }

    /**
     * Coloca el número de comparaciones en el constructor
     * @param comparaciones número de comparaciones al ejecutar el código
     */
    public static void setComparaciones(int comparaciones) {
        BubbleSort.comparaciones = comparaciones;
    }

}
