/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller1;

/**
 *
 * @author JuanFelipe
 */
public class Inversor {
    
    public static char Inv(char c){
        if(c =='T' || c=='U')
        {
            return 'A';
        }
        if(c=='A')
        {
            return 'T';
        }
        if(c=='C')
        {
            return 'G';
        }
        if(c=='G')
        {
            return 'C';
        }
        return c;
    }
    
    public static char[] Invertir(char[] ADN){
        char[] inverso = new char[ADN.length];
        int j = ADN.length-1;
        char aux;
        for(int i =0; i<ADN.length;i++,j--)
        {
            aux = Inv(ADN[i]);
            inverso[j] = aux;
            
        }
        return inverso;
    }
    
}
