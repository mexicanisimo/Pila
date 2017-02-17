/**
 * Created by El sabroso on 17/02/2017.
 */
import javax.swing.*;

/**
 * Created by El sabroso on 10/01/2017.
 */
public class Principal {
    public static void main(String args[]) {
        // Pila[] p = new Pila[5];
        Pila p=new Pila(5);
        int opc = 0;
        int dato;
        String op;
        String s;



        do {
            op= JOptionPane.showInputDialog("1 Push\n 2 Pop \n 3 Imprime elementos  \n 4 Ver tamaño \n 5 Buscar");
            dato = Integer.parseInt(op);
            switch (dato){
                case 1:
                    s =JOptionPane.showInputDialog(null," Empila ---> push");
                    opc=Integer.parseInt(s);
                    p.push(opc);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,"Quitar elemento elemento cima ---> pop");
                    p.pop();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null," Visualizar datos de pila");
                    p.recorre();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null," Tamaño de pila");
                    System.out.println( p.Size()); //se añade el metodo getter por que es privado es un dato encapsulado
                    break;
                case 5:
                    s= JOptionPane.showInputDialog(null,"Busca elemento si existe");
                    opc=Integer.parseInt(s);
                    System.out.println(p.buscar(opc));

                    break;

            }


        }while(dato!=7);
    }
}