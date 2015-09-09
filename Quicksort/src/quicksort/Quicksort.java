
package quicksort;

import complementos.AlgoritimoQuicksort;
import complementos.Lertxt;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JOptionPane;



public class Quicksort {



     
    public static void main(String a[]) throws FileNotFoundException, IOException{
             
        Lertxt ler = new Lertxt();
        int array[] = ler.converteInt("vetoInteiros.txt");
        AlgoritimoQuicksort sorter = new AlgoritimoQuicksort();
        
        sorter.sort(array);
        System.out.println("Valores Ordenados");
        System.out.println("________________________________________");
        for(int i:array){
            System.out.println(i);            
        }
        System.out.println("________________________________________");
        //System.out.println("Numero de Ordenações: " + String.valueOf(sorter.getInterations()));      
        //System.out.println("");
        JOptionPane.showMessageDialog(null, "Numero de Ordenações: " + String.valueOf(sorter.getInterations()));
        
    }

    
}
