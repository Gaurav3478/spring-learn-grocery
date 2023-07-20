package com.gauravthakur.springlearngrocery.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("GroceryItems")
public class GroceryItem {
    //what defines a grocery item? ID, name, quantity, price, available
    @Id
    int id;
    String name;
    int quantity;
    double price;
    boolean isAvailable;

    public GroceryItem() {

    }
    public GroceryItem(int id, String name, int quantity, double price, boolean isAvailable) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
