/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookextra;

import bookpack.Book;

/**
 *
 * @author hai
 */
public class BookExtra extends Book{
    private String publisher;
    
    BookExtra(String a,String t,double pri,String pub){
        super(a,t,pri);
        publisher = pub;
    }
    
    String getAuthor(){     return author;  }
    void setAuthor(String a){     author = a; }
    String getTitle(){     return title;  }
    void setTitle(String t){     title = t; }
    double getPrice(){     return price; }
    void  setPrice(double p){   price = p; }
    String getPublisher(){     return publisher;  }
    void setPublisher(String pub){     publisher = pub; }
    
    public void show(){
        super.show();
        System.out.println("publisher: "+publisher);
    }
}
