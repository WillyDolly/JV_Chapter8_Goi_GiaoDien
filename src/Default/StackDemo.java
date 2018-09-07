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
public class StackDemo implements StackInterface{
    private int tos;
    private char[] c;
  
    StackDemo(int size){
        c = new char[size];
        tos = 0;
    }

    @Override
    public void push(char a) throws ExceptionForStack.StackFullException {
       if(tos == c.length){//1.Inner class not static
           ExceptionForStack e = new ExceptionForStack();
           ExceptionForStack.StackFullException f = e.new StackFullException();
           //2. Innerclass Static
           //ExceptionForStack.StackFullException f = new ExceptionForStack.StackFullException();
           throw f;
       }
       c[tos] = a;
       tos++;
    }

    @Override
    public char pop() throws ExceptionForStack.StackEmptyException {
      if(tos==0){
          ExceptionForStack e = new ExceptionForStack();
          ExceptionForStack.StackEmptyException em = e.new StackEmptyException();
          throw em;
      }
      tos--;
      return c[tos];
    }

   
}
