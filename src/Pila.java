/**
 * Created by El sabroso on 17/02/2017.
 */
import javax.swing.*;

/**
 * Created by El sabroso on 10/01/2017.
 */
public class Pila { // clase completamente encapsulada
    private int tope;
    private int size;
    private int elements;//definido en la pila de la profesora
    private int dato[] = new int[10];

    public Pila(int t) {//tamaño
        this.size = t;
        this.elements = 0;
        this.tope = 0;
        //this.elements = t;
    }
    //metodo push

    //se extrae por el frente
    public void push(int valor) {
        if (tope < size) {
            dato[tope] = valor;
            tope++;
        } else {

            JOptionPane.showMessageDialog(null, "pila llena");
        }
    }

    public int pop() {//extraer
        int d = 0;
        int a = 0;

        if (tope > 0) {
            dato[tope] = 0;
            d = dato[tope - 1];
            System.out.println("Este es el pop :" + tope + " Dato:" + d);

            tope--;
        } else {
            JOptionPane.showMessageDialog(null, "Esta vacia la pila");
        }

        return d;
    }

    public int Size() {
        return tope;
    }


    public boolean buscar(int valor) {
        boolean b = false;
        int i = 0;
        while (i <=tope) {
            if (dato[i] == valor) {
                b = true;
            }
            i++;
        }
        return b;
    }

    public void recorre() {
        // System.out.println("visualizar el tamaño de "+dato.length);

        for (int i = 0; i < tope; i++) {
            System.out.print(dato[i]+"->" );
            //  System.out.println(">->");
        }

    }
}