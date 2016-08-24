/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemasRosalind.HAMM;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JuanFelipe
 */
public class Main {
    public static void main(String[] args) {
        try {
            FileReader fr;
            fr = new FileReader("src/problemasRosalind/HAMM/rosalind_hamm (1).txt");
            BufferedReader br = new BufferedReader(fr);
            String cadena1 = br.readLine();
            String cadena2 = br.readLine();
            int cont = 0;
            if (cadena1.length() == cadena2.length()){
                for(int i = 0; i<=cadena1.length()-1;i++){
                    if(cadena1.charAt(i)!=cadena2.charAt(i)){
                        cont++;
                    }
                }
            }
            else{
                System.out.println("Invalido");
            }
            System.out.println(cont);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
    }
    
}
