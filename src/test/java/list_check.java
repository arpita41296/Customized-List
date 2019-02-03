
import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import com.Cust_list.Book;
import com.Cust_list.custom;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class list_check {
  @Test 
    public void method() {
       custom<Book> list = new custom<>();
       list.add(new Book("ki", "jafor", 500));
       list.add(new Book("and", "gggg", 700));
       //System.out.println(list);
       custom<Book> list4 = new custom<>();
       list4.add(new Book("ka", "hossain", 900));
       list4.add(new Book("stu", "Jubin", 1000));
       list.addAll(list4);
       
       assertTrue(list.get(0).getName().equals("jafor"));
       assertTrue(list.get(3).getName().equals("Jubin"));
       list.remove(1);
       assertTrue(list.get(1).getName().equals("hossain"));
       list.removeAll(list4);
        assertTrue(1==list.size());
       
        list.clear();
        assertTrue(0==list.size());
       
      
        
    }
}
