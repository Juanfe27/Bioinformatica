/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADN;

import java.io.*;

/**
 *
 * @author Labing
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        RawADNReader br = new RawADNReader(System.in);
        System.out.println("Escriba la cadena");
        String cadena = "";
        while(br.available()!=0)
        {
           cadena = cadena+(char)br.read(); 
        }        
        System.out.println(Transformador.isADN(cadena));
        System.out.println(Transformador.isValidADN(cadena));
    }
    
}
