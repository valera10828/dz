package com.company;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        //создать массив на случаяное кол цифр от 10 до 100 отсортировать его и вывести на экран , выполнять тоже самое только пузырьком в другом классе посмотреть в интернете
        //имена классов BubbleSort and UtilSort 
        int n = 0;
        n = (int) (Math.random() * 90) + 10;
        int[] macciv = new int[n];
        for (int i = 0; i < n; i++) {
            macciv[i] = (int) (Math.random() * 1000);
        }
        System.out.println("сейчас программа выведет неотсортированный массив ");
        System.out.println(Arrays.toString(macciv));
        int n1 = macciv.length;
        int temp = 0;
        for (int i = 0; i < n1; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (macciv[j - 1] > macciv[j]) {
                    temp = macciv[j - 1];
                    macciv[j - 1] = macciv[j];
                   macciv[j] = temp;
                }

            }
        }
        System.out.println("сейчас программа выведет отсортированный массив ");
        Arrays.sort(macciv);
        System.out.println(Arrays.toString(macciv));
    }


}