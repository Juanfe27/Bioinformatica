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
public class FASTA extends FileReader{
    
    char[] alfabeto = {'A','T','C','G','U','a','c','g','t','u'};

    public FASTA(String fileName) throws FileNotFoundException {
        super(fileName);
    }
    
    @Override
    public int read() throws IOException{
        String nomCadena ="";
        String cadena="";
        int count =0;
        boolean nameFlag = false;
        while(super.ready())
                {
                    char c = (char)super.read();
                    if(c=='>')
                    {
                        if(count!=0)
                        {
                            System.out.println(nomCadena+"\n"+cadena);
                        }
                        count++;
                        nomCadena ="";
                        cadena="";
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
        System.out.println(nomCadena+"\n"+cadena);
        return (1);        
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
