package com.company.shop;

public class Good implements Comparable<Good> {
    int price;
    String description;

    @Override
    public String toString() {
        return "цена:" + price + " товар:" + description;
    }

    public Good(int price, String description) {
        this.price = price;
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int compareTo(Good g) {
        return price - g.price;

    }
}
