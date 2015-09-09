package complementos;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;


public class Lertxt {
    
    public int[] converteInt(String patch) throws FileNotFoundException, IOException{
        int retorna[] = new int[100000];
        int i=0;
        FileInputStream stream = new FileInputStream(patch);
        InputStreamReader reader = new InputStreamReader(stream);
        BufferedReader br = new BufferedReader(reader);
        String linha = br.readLine();
        while(linha != null) {           
            int passa = Integer.parseInt(linha);
            if(passa > 0 || passa == 0 || passa <0){
                retorna[i] = passa;
            }        
            linha = br.readLine();        
            i++;
        }
        return retorna;
    }
    
}
