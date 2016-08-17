/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemasRosalind.RNA;

import java.io.FileReader;

/**
 *
 * @author JuanFelipe
 */
public class Main {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("src/problemasRosalind/RNA/rosalind_rna.txt");
            String cadena ="";
            while (fr.ready())
            {
                char c = (char)fr.read();
                switch(c){
                    case 'A': cadena= cadena+c;break;
                    case 'C': cadena = cadena+c;break;
                    case 'T': cadena = cadena+'U';break;
                    case 'G': cadena = cadena+c;break;
                    default: System.out.println("Invalido");break;               
                }
            }
            System.out.println(cadena);
        }
        catch(Exception e){
            
        }
    }
    
}
