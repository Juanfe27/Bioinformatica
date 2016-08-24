/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemasRosalind.PROT;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

/**
 *
 * @author JuanFelipe
 */
public class rnaTable {
    
    HashMap<String,String> tabla;
    
    public rnaTable(){
    try{
        BufferedReader br = new BufferedReader(new FileReader("src/problemasRosalind/PROT/rnaCodon.txt"));
        tabla = new HashMap();
        while(br.ready()){
            String linea = br.readLine().trim();
            tabla.put(linea.substring(0, 3), linea.substring(3, linea.length()));   
            
        }
      }
    catch(Exception e){
            System.out.println(e);
        }    
    }
    
    public String buscar(String llave){
        String algo = tabla.get(llave);
        return algo;
    }
    
    
    
}
