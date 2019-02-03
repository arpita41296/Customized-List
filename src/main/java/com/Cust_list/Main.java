/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Cust_list;

public class Main {

    public static void main(String[] args) {
       custom<String> list=new custom<>();
       list.add("farah");
       list.add("kabir");
       list.add("poo");

        custom<String> list2=new custom<>();
         list2.add("sopna");
         list2.add("lina");
        list2.addAll(list);
        System.out.println(list2);
        list2.removeAll(list);
        System.out.println(list2);
        
        list.remove(2);
        System.out.println(list);

       
        System.out.println(list.get(0));
        System.out.println(list.get(1));

        
        System.out.println(list.size());

    }
}
