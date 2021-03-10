package com.company;

import java.util.Arrays;

public class Loader {
    public static void main(String[] args) {
        //задача:вывести сумму, в консоль всех i от 0 до 9
        int dlina = 10;
        int[] array = new int[dlina];
        int summa = 0;
        int prisvedenie = 1;
        for (int i = 1; i < dlina; ++i) {
            System.out.println(" привет я цифра " + i);
            array[i] = i;
            summa = summa + i;
            prisvedenie = prisvedenie * i;

        }
        System.out.println("сумма = " + summa);
        System.out.println("произведение = " + prisvedenie);

    }

}
