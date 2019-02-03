/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Cust_list;

/**
 *
 * @author acer
 */
public class Book {
    String Authorname;
    String name;
    int price;
    public Book(String Authorname, String name,  int price) {
        this.Authorname = Authorname;
        this.name = name;
        this.price = price;
    }

    public String getAuthorname() {
        return Authorname;
    }

    public void setAuthorname(String Authorname) {
        this.Authorname = Authorname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

   
    
}
