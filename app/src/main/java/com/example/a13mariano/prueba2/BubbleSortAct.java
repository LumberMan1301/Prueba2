package com.example.a13mariano.prueba2;

import android.drm.DrmStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.a13mariano.prueba2.ListaSimple.ListaSimple;

import static com.example.a13mariano.prueba2.Sort.BubbleSort.getComparaciones;
import static com.example.a13mariano.prueba2.Sort.BubbleSort.setComparaciones;
import static com.example.a13mariano.prueba2.Sort.BubbleSort.sort;

/**
 * Clase principal o MainActivity que se ejecuta en el Dispositvo android
 */
public class BubbleSortAct extends AppCompatActivity {

    /**
     * atributos de la clase, que hacen referencia a su vez a algun tipo de objeto en el Diseno del movil
     */
    private Button botonLista;
    private Button botonSort;

    private TextView textLista;
    private TextView textListaSort;
    private static EditText textPaso;


    private TextView cantComparaciones;
    private TextView cantNumeros;
    /**
     * atributos necesarios para Guardar los elementos a ordenar
     */
    private static ListaSimple l = new ListaSimple();
    private int cantidad;
    private String listaS = "[";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prueba2);

        this.setTitle("BubbleSortAct");

        textLista = (TextView)findViewById(R.id.txtLista);
        textListaSort = (TextView)findViewById(R.id.txtListaSort);
        textPaso = (EditText) findViewById(R.id.txtPaso);


        cantComparaciones = (TextView)findViewById(R.id.cantComparaciones);
        cantNumeros = (TextView)findViewById(R.id.cantNumeros);


        botonLista = (Button)findViewById(R.id.btnLista);
        botonLista.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                textLista.setText(llenarLista());
                textListaSort.setText("");
                cantNumeros.setText("");
                cantComparaciones.setText("");
                setComparaciones(0);
                textPaso.setText("");



            }
        });

        botonSort = (Button)findViewById(R.id.btnSort);
        botonSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textListaSort.setText(listaSort());
                l.vaciar();
                listaS = "[";
                cantComparaciones.setText(String.valueOf(getComparaciones()));
                cantNumeros.setText(String.valueOf(cantidad));


            }
        });


    }

    /**
     * Genera una lista con valores random
     * @return lista de valores random
     */
    private String llenarLista(){

        String lista = "[";

        // cantidad de numeros
        cantidad= (int) (Math.random() * 20) + 20;


        for (int i = 0; i < cantidad; i++) {
            //numero aleatorio
            int num = (int) (Math.random() * 99);
            l.insertar(num);
            lista += String.valueOf(num) + ", ";
        }

        lista += " ]";
        return lista;
    }

    /**
     * Ordena la lista de mayor a menor
     * @return lista ordenada
     */
    private String listaSort(){

        sort(l);
        l.imprimirL();
        for (int i = 0; i<l.getCapacidad();i++){
            listaS += String.valueOf(l.get(i))+", ";
        }
        listaS += "]";
        return listaS;

    }

    public static EditText getTextPaso() {
        return textPaso;
    }
}

