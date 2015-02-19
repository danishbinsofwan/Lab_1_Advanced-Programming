/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_danish;

/**
 *
 * @author test2
 */
public class MultAdd {
    MultAdd( takeInput obj1 ,  takeInput obj2 , takeInput obj3)
    {
        takeInput temp = new takeInput();
        Multiply mult = new Multiply(obj1,obj2);
        temp.a = mult.Multiplier();
        
        Add adder = new Add(temp , obj3);
        adder.Adder();
        adder.viewMatrix();
    }
}
