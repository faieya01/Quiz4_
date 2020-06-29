/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz4_cc104;

/**
 *
 * @author Fairy
 */
public class EmptyWords extends Exception {
    public EmptyWords(){
       super("There's no words left");
    }
}
