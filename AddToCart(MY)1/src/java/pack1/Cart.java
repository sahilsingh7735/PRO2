/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.util.HashMap;

/**
 *
 * @author w
 */
public class Cart {
    HashMap<Integer,Product> ap=new HashMap<>();
    int x=0;
    
    boolean addProduct(String name,float price,String pid)
    {    ++x;
        ap.put(x,new Product(name,price,pid));
        return true;
    }
    
    public float totalPrice()
    {
        float sum=0.0f;
        for(int i=1;i<=x;i++)
        {
            sum=sum+ap.get(i).price;
        }
        return sum;
    }
}
