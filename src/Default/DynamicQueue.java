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
public class DynamicQueue implements Interface_CircularQueue {
    private char[] q;
    int putLoc, getLoc;
    
    DynamicQueue(int size){
        q = new char[size+1];
        putLoc = getLoc = 0;
    }

    @Override
    public void put(char c) {
        if(putLoc == q.length -1){
            char[] t = new char[q.length *2];
            for(int i=0;i<q.length;i++)
                t[i] = q[i];
            q = t;
        }
        putLoc++;
        q[putLoc] = c;
    }
     @Override
    public char get() {
       if(getLoc == putLoc){
           System.out.println("empty Queue");
           return (char)0;
       }
       getLoc++;
       return q[getLoc];
    }
    
  
}
