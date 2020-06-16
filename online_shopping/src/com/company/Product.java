
package com.company;

import java.util.Date;

/**
 * Created by gauri.singh on 1/24/2020.
 */
public class Product {
    private String description;
    private int price;
    private Date m_date;


    public Product() {
        this.description = "";
        this.price = 0;
        this.m_date = null;

    }

    public Product(String description, int price, Date m_date) {
        this.description = description;
        this.price = price;
        this.m_date = m_date;

    }

    public Product(Product product) {
        this.description = product.description;
        this.price = product.price;
        this.m_date = product.m_date;


    }

     @Override
    public String toString() {
      return " [Item: " + description + ", Cost: " + price + ", manufacture date" + m_date +"]";
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getM_date() {
        return m_date;
    }

    public void setM_date(Date m_date) {
        this.m_date = m_date;
    }


}