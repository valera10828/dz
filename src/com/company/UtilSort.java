package com.company;

import java.util.Arrays;

public class UtilSort {
    public static void main(String[] args) {
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
        System.out.println("сейчас программа выведет отсортированный массив ");
        Arrays.sort(macciv);
        System.out.println(Arrays.toString(macciv));
    }
}
