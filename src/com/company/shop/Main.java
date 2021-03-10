package com.company.shop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 100 товаров с генерацией
        int sum = 0;


        double mean = sum / (double) 100;
        List<Good> goods = new ArrayList<>();

        goods.add(new Good(90, "apple"));
        goods.add(new Good(60, "pile"));
        goods.add(new Good(80, "coffee"));
        goods.add(new Good(120, "banana"));
        goods.add(new Good(70, "chocolate"));
        goods.add(new Good(90, "tangerine"));
        goods.add(new Good(50, "ice cream"));
        goods.add(new Good(70, "milk"));
        goods.add(new Good(65, "praline"));
        goods.add(new Good(75, "orange"));
        for (int i = 0; i < 100; i++) {
            int b = (int) (Math.random() * 1000) + 1;
            goods.add(new Good(b, "good"));

        }
        Collections.sort(goods);
        System.out.println(goods);
        for (Good g : goods
        ) {
            System.out.println(g);
        }
        System.out.println(mean);
        System.out.println(goods.get(80).getPrice());
    }
}
