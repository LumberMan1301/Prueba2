package com.example.a13mariano.prueba2.ListaSimple;

//falta el java DOC
public class ListaSimple {
    private NodoSimple primero;
    private int capacidad;

    public ListaSimple(){
        this.primero=null;
        this.capacidad = 0;
    }

    public void insertar(int dato){
        NodoSimple aux = new NodoSimple(dato);
        if (this.capacidad == 0){
            this.primero = aux;
            capacidad++;
        }else{
            NodoSimple actual = this.primero;
            for (int i = 0; i<this.capacidad-1;i++){
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(aux);
            this.capacidad++;
        }
    }

    public void imprimirL(){
        if(this.capacidad == 0)
            System.out.println("Lista Vacia");
        else{
            NodoSimple actual = this.primero;
            System.out.print("[");
            for (int i = 0; i<this.capacidad-1;i++){
                System.out.print(actual.getData()+", ");
                actual = actual.getSiguiente();
            }
            System.out.print(actual.getData()+"]\n");
        }
    }



    public int get(int i) {
        NodoSimple aux = this.primero;
        int x = 0;
        while (x != i) {
            aux = aux.getSiguiente();
            x++;
        }
        if (aux == null) {
            System.out.println("El elemento no se encuentra en la lista");
        }
        return aux.getData();
    }
    public NodoSimple getNodo(int i){
        NodoSimple aux = this.getPrimero();
        int x = 0;
        while(x != i){
            aux = aux.getSiguiente();
            x++;
        }
        return aux;
    }
    public void swap(int i1, int i2){
        int i = get(i1);
        int j = get(i2);
        getNodo(i1).setData(j);
        getNodo(i2).setData(i);
    }

    public void vaciar(){
        this.capacidad = 0;
        this.primero = null;
    }

    public String meterLista(){
        String lista = "[";
        for(int i = 0; i < this.capacidad; i++){
            lista+= String.valueOf(this.get(i))+", ";
        }
        lista +="]\n\n";
        return lista;
    }


    public NodoSimple getPrimero() {
        return primero;
    }

    public int getCapacidad() {
        return capacidad;
    }
}
