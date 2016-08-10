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
public class CremaBatida extends Adicion{

    @Override
    public String printName() {
        return "Crema Batida "+this.obj_fafe.printName();
    }
    
    public CremaBatida(Cafe c){
        this.obj_fafe = c;
    }
    
}
