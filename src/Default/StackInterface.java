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
public interface StackInterface {
   // ExceptionForStack e = new ExceptionForStack(); e can not access to inner classes
    void push(char a) throws ExceptionForStack.StackFullException;
    char pop() throws ExceptionForStack.StackEmptyException;
}
