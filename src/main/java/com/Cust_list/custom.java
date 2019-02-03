/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Cust_list;

import java.util.Arrays;


public class custom<E> {

    private int size = 0;
    private Object[] f;

    public custom() {
        f = new Object[20];
    }

    public void add(E e) {
        if (size == f.length) {
            exceed();
        }
        f[size] = e;
        size++;
    }

   private void exceed() {
		// TODO Auto-generated method stub
	   int nsize = f.length * 3;
       f = Arrays.copyOf(f, nsize); 
		
	}

public void addAll(custom<E> list) {

        for (int i = 0; i < list.size; i++) {
            if (size == f.length) {
               exceed();
            } else {
                f[size] = list.get(i);
                size++;
            }

        }
    }

  
    public E get(int i) {
       
        return (E) f[i];
    }

    public E remove(int i) {

        Object item = f[i];
        int elements = f.length - (i + 1);
        System.arraycopy(f, i + 1, f, i, elements);
        size--;
        return (E) item;
    }

    public E[] removeAll(custom<E> list) {
        Object[] item = new Object[list.size + 1];
        int s = 0;
        for (int i = 0; i < list.size; i++) {

            for (int j = 0; j < f.length; j++) {
                if (f[j] == list.get(i)) {
                    item[s++] = list.get(i);
                    int elements = f.length - (j + 1);
                    System.arraycopy(f, j + 1, f, j, elements);
                    size--;
                }
            }

        }
        return (E[]) item;
    }
    public E[] clear() {
        Object[] item = new Object[f.length + 1];
        int s=0;

            for (int j = 0; j < f.length; j++) {
                
                    item[s++] = f[j];
                    int elements = f.length - (j + 1);
                    System.arraycopy(f, j + 1, f, j, elements);
                    size--;
                }
            

        size=0;
        return (E[]) item;
        
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
       
        for (int i = 0; i < size; i++) {
            sb.append(f[i].toString());
            if (i < size - 1) {
                sb.append(" ");
            }
        }
   
        return sb.toString();
    }

    

}
