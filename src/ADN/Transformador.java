/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADN;

import java.util.IllegalFormatException;
import java.util.regex.Pattern;

/**
 *
 * @author Labing
 */
public class Transformador {
      
    public static boolean isADN(String ADNCandidate)
    {
        if(ADNCandidate.toUpperCase().contains("T") && !ADNCandidate.toUpperCase().contains("U")){
            return true;
        }
        return false;
    }
    public static boolean isARN(String ARNCandidate)
    {
        if(ARNCandidate.toUpperCase().contains("U")&& !ARNCandidate.toUpperCase().contains("T")){
            return true;
        }
        return false;
    }
    public static boolean isValidADN(String ADNCandidate)
    {
        return Pattern.matches("A*T*C*G", ADNCandidate);
    }
    public static boolean isValidARN(String ARNCandidate)
    {
        return Pattern.matches("A*U*C*G", ARNCandidate);
    }
    public static String toARN(String ADN) throws IllegalFormatException, NullPointerException
    {
        return ADN.replace('T', 'U');
    }
    public static String toADN(String ARN) throws IllegalFormatException, NullPointerException
    {
        return ARN.replace('U', 'T');
    }
    
}
