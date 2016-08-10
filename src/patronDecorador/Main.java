/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronDecorador;

/**
 *
 * @author Labing
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cafe fafe = new Capuccino();
        fafe = new Leche(fafe);
        fafe = new Azucar(fafe);
        System.out.println(fafe.printName());
        Cafe fafesito = new Mocca();
        fafesito = new CremaBatida(fafesito);
        fafesito = new Azucar(fafesito);
        System.out.println(fafesito.printName());
    }
    
}
