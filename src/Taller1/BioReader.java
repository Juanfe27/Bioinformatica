/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller1;

import java.io.*;

/**
 *
 * @author JuanFelipe
 */
public abstract class BioReader extends FileReader{
    
    public BioReader(String fileName) throws FileNotFoundException {
        super(fileName);
    }
    
    public abstract int read() throws IOException;
    public abstract boolean contains(char c);
    
}
