/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemasRosalind.REVC;

import java.io.FileReader;

/**
 *
 * @author JuanFelipe
 */
public class Main {
    
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("src/problemasRosalind/REVC/rosalind_revc.txt");
            String cadena="";
            String inverso ="";
            while (fr.ready()){
                char c = (char)fr.read();
                if(c=='A'){
                    cadena = cadena+'T';
                }
                else if(c=='C'){
                    cadena = cadena+'G';
                }
                else if(c=='G'){
                    cadena = cadena+'C';
                }
                else if(c=='T'){
                    cadena = cadena+'A';
                }
                else{
                    System.out.println("Invalido");
                }
                if(c==-1){
                    break;
                }
            }
            for(int i = cadena.length()-1;i >= 0;i--){
                inverso = inverso+cadena.charAt(i);
            }
            System.out.println(inverso);
        }
        catch (Exception e){
            System.out.println(e);
        }
        
        
    }
    
}
