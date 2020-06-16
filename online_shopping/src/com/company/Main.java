package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    private ArrayList<Product> ItemList;

    public Main() {
        ItemList = new ArrayList<Product>();
    }

    public Product searchitem(String description1) {
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
    }

    public static void main(String[] args) {


        System.out.println("Category of Products available..\n1.Electronics\n2. Clothing\n");

        int totalcost=0;

        boolean excep = true;

        int ans = 0;

        while(excep) {

            try {

                boolean flag = true;

                while (flag) {
                    int choice=0;
                    if (ans==0) {

                        Scanner input = new Scanner(System.in);
                        System.out.println("Enter choice for product category");
                        choice = input.nextInt();
                    }
                        ans = 1;

                        Main m = new Main();

                        if (choice == 1) {

                            System.out.println("Available Products:\n Description\t\t Price\t\t Manufacture date");
                            System.out.println("1. SamsungTV\t\t 13000\t\t\t null\n2. SonyPhone\t\t 26000\t\t\t null\n3. LG Referigerator \t\t 20000\t\t\t null\"");

                            boolean flag1 = true;

                            int n =0;


                            while (flag1) {
                                if (ans == 1) {
                                    System.out.println("Enter Number of products for purchase?");
                                    Scanner input1 = new Scanner(System.in);
                                    n = input1.nextInt();
                                    ans = 2;
                                } else if (ans==2){

                                    if (n < 4) {

                                        for (int i = 0; i < n; i++) {

                                            System.out.println("Enter product choice:");
                                            Scanner input0 = new Scanner(System.in);
                                            int ch = input0.nextInt();


                                            System.out.println("Enter quantity of this product");
                                            Scanner input3 = new Scanner(System.in);
                                            int q = input3.nextInt();

                                            //Main m = new Main();


                                            if (ch == 1) {
                                                Electronics e1 = new Electronics("SamsungTV", 13000, null);
                                                //Main m = new Main();
                                                m.addItem("SamsungTV", 13000, null);
                                                int cost = q * e1.getPrice();
                                                System.out.println("Price of " + q + " " + e1.getDescription() + " is Rs. " + cost);
                                                totalcost += cost;

                                            } else if (ch == 2) {
                                                Electronics e2 = new Electronics("SonyPhone", 26000, null);
                                                //Main m = new Main();
                                                m.addItem("SonyPhone", 26000, null);
                                                int cost = q * e2.getPrice();
                                                System.out.println("Price of " + q + " " + e2.getDescription() + " is Rs. " + cost);
                                                totalcost += cost;

                                            } else if (ch == 3) {
                                                Electronics e3 = new Electronics("LG Referigerator", 20000, null);
                                                //Main m = new Main();
                                                m.addItem("LG Referigerator", 20000, null);
                                                int cost = q * e3.getPrice();
                                                System.out.println("Price of " + q + " " + e3.getDescription() + " is Rs. " + cost);
                                                totalcost += cost;

                                            } else {

                                                System.out.println("Please Enter valid choice...");
                                                i -= 1;
                                            }
                                        }
                                        flag1 = false;
                                    } else {
                                        System.out.println("3 type of electronics product available only...");
                                    }
                                }
                                System.out.println("You have ordered: ");
                                //Electronics e = new Electronics();
                                m.display();
                                System.out.println("Total Cost : Rs" + totalcost);
                                flag = false;
                            }
                            } else if (choice == 2) {


                                        System.out.println("Available Products:\n Description\t\t Price\t\t Manufacture date");
                                        System.out.println("1. White Shirt\t\t 1000\t\t\t null\n2. Red Saree\t\t 2000\t\t\t null\n3. Blue Jeans\t\t 2500\t\t\t null\n4. Green Kurta\t\t 1500\t\t\t null");

                                        boolean flag2 = true;

                                        while (flag2) {


                                            System.out.println("Enter number of products for purchase?");
                                            Scanner input11 = new Scanner(System.in);
                                            int n1 = input11.nextInt();

                                            if (n1 < 5) {


                                                for (int i = 0; i < n1; i++) {

                                                    System.out.println("Enter product choice:");
                                                    Scanner input0 = new Scanner(System.in);
                                                    int ch = input0.nextInt();

                                                    System.out.println("Enter number of quantity of this product");
                                                    Scanner input3 = new Scanner(System.in);
                                                    int q = input3.nextInt();

                                                    //Main m = new Main();

                                                    if (ch == 1) {
                                                        Clothing c1 = new Clothing("White Shirt", 1000, null);
                                                        //Main m = new Main();
                                                        m.addItem("White Shirt", 1000, null);
                                                        int cost = q * c1.getPrice();
                                                        System.out.println("Price of " + q + " " + c1.getDescription() + " is Rs. " + cost);
                                                        totalcost += cost;
                                                    } else if (ch == 2) {
                                                        Clothing c2 = new Clothing("Red Saree", 2000, null);
                                                        //Main m = new Main();
                                                        m.addItem("Red Saree", 2000, null);
                                                        int cost = q * c2.getPrice();
                                                        System.out.println("Price of " + q + " " + c2.getDescription() + " is Rs. " + cost);
                                                        totalcost += cost;
                                                    } else if (ch == 3) {
                                                        Clothing c3 = new Clothing("Blue Jeans", 25000, null);
                                                        //Main m = new Main();
                                                        m.addItem("Blue Jeans", 25000, null);
                                                        int cost = q * c3.getPrice();
                                                        System.out.println("Price of " + q + " " + c3.getDescription() + " is Rs. " + cost);
                                                        totalcost += cost;
                                                    } else if (ch == 4) {

                                                        Clothing c4 = new Clothing("Green Kurta", 1500, null);
                                                        //  Main m = new Main();
                                                        m.addItem("Green Kurta", 1500, null);
                                                        int cost = q * c4.getPrice();
                                                        System.out.println("Price of " + q + " " + c4.getDescription() + " is Rs. " + cost);
                                                        totalcost += cost;
                                                    } else {
                                                        System.out.println("Please enter valid choice: ");
                                                        i -= 1;
                                                    }
                                                }
                                                flag2 = false;
                                            } else {
                                                System.out.println("Only 4 type of clothing products available...");
                                            }
                                        }
                                        System.out.println("You have ordered: ");
                                        //Clothing c = new Clothing();
                                        m.display();
                                        System.out.println("Total Cost : Rs" + totalcost);

                                        flag = false;
                                    } else {

                                        System.out.println("Enter valid choice...");

                                    }
                                }

                                excep = false;


                            }catch(Exception e){

                System.out.println("Please provide valid input");
            }



        }
    }
}


