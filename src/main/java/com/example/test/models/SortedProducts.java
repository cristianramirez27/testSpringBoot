package com.example.test.models;

import lombok.Data;

@Data
public class SortedProducts {
    
    private String item;
    private int price;

    public SortedProducts(String item, int price) {
        this.item = item;
        this.price = price;
    }

    public SortedProducts () {
    }

}
