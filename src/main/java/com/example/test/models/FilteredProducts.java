package com.example.test.models;

import lombok.Data;

@Data
public class FilteredProducts {
    private String barcode;
    private String item;
    private String category;
    private int price;
    private int discount;
    private int available;

    public FilteredProducts(String barcode, String item, String category, int price, int discount, int available) {
        this.barcode = barcode;
        this.item = item;
        this.category = category;
        this.price = price;
        this.discount = discount;
        this.available = available;
    }

    public FilteredProducts() {
    }
    
}
