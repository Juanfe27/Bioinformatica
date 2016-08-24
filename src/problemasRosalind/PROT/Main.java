/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemasRosalind.PROT;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author JuanFelipe
 */
public class Main {

    public static void main(String[] args) throws IOException {
        try {
            rnaTable tablita = new rnaTable();
            FileReader fr = new FileReader("src/problemasRosalind/PROT/rosalind_prot.txt");
            String cadena = "";
            String resultado = "";
            int cont = 0;
            while (fr.ready()) {
                while (cont < 3) {
                    char c = (char) fr.read();
                    cadena = cadena + c;
                    cont++;
                    if (c == -1) {
                        break;
                    }
                }
                resultado = resultado + tablita.buscar(cadena);
                cont = 0;
                cadena = "";
            }
            System.out.println(resultado.replace(" ", ""));

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

    }
}
