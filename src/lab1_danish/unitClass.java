/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1_danish;
import java.util.Scanner;
import java.util.*;


//import Scanner as we require it.
import java.util.Scanner;
 
// the name of our class its public
public class unitClass {
    //void main
        public static void main (String[] args)
        {
            takeInput obj1 = new takeInput();
            takeInput obj2 = new takeInput();
            takeInput obj3 = new takeInput();
            obj1.take();
            obj2.take();
            obj3.take();
            
            // Add Test
            Add adder = new Add(obj1 , obj2);
            adder.Adder();
            adder.viewMatrix();
            
            //SUbstract Test
            Substract sub = new Substract(obj1,obj2);
            sub.Sub();
            sub.viewMatrix();
            
            //Multiply Test
            Multiply mult = new Multiply(obj1,obj2);
            mult.Multiplier();
            mult.viewMatrix();
            
            //Multiply and Add test2
            MultAdd MA = new MultAdd(obj1 , obj2 , obj3);
        }
}