/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller1;

import java.io.*;
import java.util.*;

/**
 *
 * @author Labing
 */
public class FASTQ extends FileReader{

    char[] alfabeto = {'A','T','C','G','U','a','c','g','t','u'};
    public static List<String> nombres;
    public static List<String> cadenas;
    
    public FASTQ(String fileName) throws FileNotFoundException {
        super(fileName);
        nombres = new ArrayList<>();
        cadenas = new ArrayList<>();
    }
    
    @Override
    public int read() throws IOException{
        String nomCadena = "";
        String cadena = "";
        String calidad ="";
        int count = 0;
        boolean nameFlag =false;
        boolean qualityFlag = false;
        boolean qualityDesc = false;
        while(super.ready())
                {
                    int b = super.read();
                    if(b == -1)
                    {
                        return 0;
                    }
                    char c = (char)b;
                    if(c=='@' && calidad.length()== cadena.length())
                    {
                        if(count!=0)
                        {
                            nombres.add(nomCadena);
                            cadenas.add(cadena);
                            System.out.println(nomCadena+"\n"+cadena+"\n"+calidad);
                        }
                        count++;
                        nomCadena ="";
                        cadena="";
                        calidad="";
                        nameFlag = true;
                        continue;
                    }
                    while (nameFlag)
                        {
                            if(c=='\n')
                                {
                                    nameFlag = false;
                                    continue;
                                }
                            nomCadena = nomCadena+c;
                            c = (char)super.read();
                        }                    
                    if(!nameFlag)
                    {
                        if(c=='+')
                        {
                            qualityDesc = true;
                            continue;
                        }
                        while(qualityDesc)
                        {
                            if(c=='\n' || c=='\r')
                                {
                                    qualityDesc = false;
                                    qualityFlag = true;
                                }
                        }
                        while(qualityFlag)
                        {
                            if(c=='\n' || c=='\r' || c==' ')
                                {
                                    c = (char)super.read();
                                    continue;
                                }
                            if((int)c >=33 && (int)c<=126)
                            {
                                calidad = calidad+c;
                                b= super.read();
                                if(b==-1)
                                {
                                    return 0;
                                }
                                c = (char)b;
                            }
                            else
                            {
                                throw new IOException("Calidad inválida");
                            }
                            if(cadena.length()==calidad.length())
                            {
                                qualityFlag = false;
                                c = '\n';
                            }
                        }
                        if(c=='\n' || c=='\r' || c==' ')
                                {
                                    continue;
                                }
                        if(contains(c))
                        {
                            cadena = cadena+Character.toUpperCase(c);
                        }
                        else
                        {
                            throw new IOException("Invalido");
                        }
                    }
                }
        if (count == 1)
        {            
            nombres.add(nomCadena);
            cadenas.add(cadena);
        }
        return 1;
    }
    public boolean contains(char c){
        for(int i = 0;i<alfabeto.length;i++)
        {
            if(alfabeto[i] == c)
            {
                return true;
            }
        }
        return false;
    }

    
}
