package com.company;

import java.util.Date;

/**
 * Created by gauri.singh on 1/24/2020.
 */
public class Clothing extends Product {

    //private ArrayList<Product> ItemList;
    //private Scanner sc = new Scanner(System.in);

    public Clothing() {

       // ItemList = new ArrayList<Product>();

    }

    public Clothing(String description, int price, Date m_date) {
        super(description, price, m_date);


        //ItemList = new ArrayList<Product>();
    }

   /* public Product searchitem(String description1) {
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

    public void display() {

        Iterator<Product> itr = ItemList.iterator();
        //Electronics item;
        while (itr.hasNext()) {
            Product product = itr.next();
            System.out.println(product);


        }
    }*/
}



