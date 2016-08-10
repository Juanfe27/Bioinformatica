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
public class Leche extends Adicion{

    @Override
    public String printName() {
        return "Leche "+this.obj_fafe.printName();
    }
    public Leche(Cafe c){
        this.obj_fafe = c;
    }
    
}
