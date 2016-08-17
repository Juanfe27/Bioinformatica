/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemasRosalind.ADN;

import java.io.FileReader;

/**
 *
 * @author JuanFelipe
 */
public class Main {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("src/problemasRosalind/ADN/rosalind_dna.txt");
            int aCount = 0;
            int cCount = 0;
            int gCount = 0;
            int tCount = 0;
            while(fr.ready()){
                char c = (char)fr.read();
                if (c=='A'){
                    aCount++;
                }
                else if(c=='C'){
                    cCount++;
                }
                else if(c=='G'){
                    gCount++;
                }
                else if(c=='T'){
                    tCount++;
                }
                else{
                    System.out.println("Invalido");
                    System.out.println((int)c);
                    break;
                }
                if(c==-1)
                {
                    break;
                }
            }
            System.out.println(aCount+" "+cCount+" "+gCount+" "+tCount);
            
        }
        catch (Exception e){
            System.out.println(e);
        }
        
    }
   
}
