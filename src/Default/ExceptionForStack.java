/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Default;

/**
 *
 * @author hai
 */
public class ExceptionForStack {
    
     class StackFullException extends Exception{
        public String toString(){
            return "Full Stack";
        }
    }
    
     class StackEmptyException extends Exception{
        public String toString(){
            return "Empty Stack";
        }
    }
}
