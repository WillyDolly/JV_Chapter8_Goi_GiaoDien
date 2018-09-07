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
public class CircularQueue_Main {
    public static void main(String[] args) {
        CircularQueue CQueue = new CircularQueue(6);
        System.out.println("put in symbols");
        for(int i=0;i<=5;i++){
            CQueue.put((char) ('a'+i));
        }
        System.out.println("get out ");
        for(int i=0;i<=5;i++){
            System.out.println( CQueue.get()+" ");
        }
        for(int i = 0;i<=6;i++){
            CQueue.put((char)('f'+i));
        }
         for(int i=0;i<=2;i++){
            System.out.println( CQueue.get()+" ");
        }
          for(int i = 0;i<=2;i++){
            CQueue.put((char)('a'+i));
          }
              for(int i=0;i<=5;i++){
            System.out.println( CQueue.get()+" ");
        }
        System.out.println("Dynamic Queue: ");
        Interface_CircularQueue IQ;    
        DynamicQueue DQueue = new DynamicQueue(5);
        IQ = DQueue;
        for(int i=0;i<10;i++){
            IQ.put((char)('a'+i));
            System.out.println(IQ.get());
        }
            
    }
}
