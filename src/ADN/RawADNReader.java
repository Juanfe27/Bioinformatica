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
public class RawADNReader extends FilterInputStream{
    
    public RawADNReader(InputStream in){
        super(in);
    }
    
    @Override
    public int read() throws IOException{    
    char c = (char)super.read();
    if(c!='A'&& c!='C'&& c!='G' && c!='T')
    {
        throw new IOException("Invalido");
    }
    return ((int)c);
    }
    
}
