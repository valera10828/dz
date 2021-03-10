package com.company;

public class Even {
    public static void main(String[] args) {
        //вывести все четные числа  в консоль от 0 до случаяноного числа которое не может быть меньше 0 или больше 1000
        int c = (int) (Math.random() * 1000);
        for (int i = 0; i < c; i++) {
            if (i % 2 == 0) {
                System.out.println("привет я четное число " + i);

            }

        }
        int a = 27;
        System.out.println(27 % 2);
        System.out.println("случаяное число " + c);
        int i1 = (int) (Math.random() * 4);
        System.out.println(i1);
    }
}
