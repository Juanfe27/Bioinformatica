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
public class Whiskey extends Adicion{

    @Override
    public String printName() {
        return "Whiskey "+this.obj_fafe.printName();
    }
    
}
