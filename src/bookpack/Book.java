/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookpack;

/**
 *
 * @author hai
 */
public class Book {
    protected String author;
    protected String title;
    protected double price;
    
    public Book(String a,String t,double p){
        this.author = a;
        this.title = t;
        this.price = p;
    }
    
    public void show(){
        System.out.println("author: "+author);
        System.out.println("title: "+title);
        System.out.println("price: "+price);
    }
}
