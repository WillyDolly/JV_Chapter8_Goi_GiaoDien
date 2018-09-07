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
public class CircularQueue implements Interface_CircularQueue{
  int putLoc, getLoc;
  private char[] ch;

    CircularQueue(int size){
        putLoc = getLoc = 0;
        ch = new char[size+1];
    }
    
    @Override
    public void put(char c) {
       if(putLoc +1 == getLoc |
               (putLoc == ch.length-1 & getLoc == 0)){
            System.out.println("full Queue");
            return;
       }
        putLoc++;
        if(putLoc == ch.length) putLoc = 0;
        ch[putLoc] = c;
    }

    @Override
    public char get() {
        if(getLoc == putLoc){
            System.out.println("empty Queue");
            return (char) 0;
        }
        getLoc++;
        if(getLoc == ch.length) getLoc = 0;
        return ch[getLoc];
    }
    
}
