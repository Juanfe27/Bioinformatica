/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller1;

import java.io.*;

/**
 *
 * @author Labing
 */
public class Main {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
                
        FASTQ lector = new FASTQ("src/Taller1/test.fq");
        lector.read();
        lector.imprimirDatos();
        for(int i =0; i<FASTQ.cadenas.size();i++)
        {
            //System.out.println(Inversor.Invertir(FASTQ.cadenas.get(i).toCharArray()));
        }            
    }
    
}
