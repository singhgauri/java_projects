package com.company;

import java.util.Date;

/**
 * Created by gauri.singh on 1/24/2020.
 */
public class Electronics extends Product {

   // private ArrayList<Product> ItemList;

    public Electronics() {

        //ItemList = new ArrayList<Product>();

    }

   public Electronics(String description, int price, Date m_date) {
       super(description, price, m_date);


        //ItemList = new ArrayList<Product>();
    }

    /*public Product searchitem(String description1) {
        Iterator<Product> itr = ItemList.iterator();
        //Electronics item;
        while (itr.hasNext()) {
            Product product = itr.next();
            if (product.getDescription() == description1) {
                return product;
            }
        }
        return null;
    }

    public void addItem(String des,int pri,Date m_date1) {

        Product founditem = searchitem(des);

        if (founditem == null) {
            Product newitem = new Product(des,pri,m_date1);
          //  newitem.addItem(description,price,m_date);
            ItemList.add(newitem);
        } else {
            System.out.println("Item exists already");
        }


    }

    public static void display() {

        Iterator<Product> itr = ItemList.iterator();
        //Electronics item;
        while (itr.hasNext()) {
            Product product = itr.next();
            System.out.println(product);


        }
    }*/
}