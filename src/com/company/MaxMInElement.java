package com.company;

import java.util.Arrays;

public class MaxMInElement {
    public static void main(String[] args) {
        int n = 0;
        n = (int) (Math.random() * 90) + 10;
        int sum = 0;

        int[] macciv = new int[n];
        for (int i = 0; i < n; i++) {
            macciv[i] = (int) (Math.random() * 1000);
            sum += macciv[i];
        }
        double mean = sum / (double) n;
        System.out.println("сейчас программа выведет неотсортированный массив ");
        System.out.println(Arrays.toString(macciv));
        int n1 = macciv.length;
        int temp = 0;
        System.out.println("сейчас программа выведет отсортированный массив ");
        Arrays.sort(macciv);
        System.out.println(Arrays.toString(macciv));
        System.out.println("минимальный по значению элемент " + macciv[0]);
        System.out.println("среднее арифмитическое " + mean);
        System.out.println("максимальный по значению элемент " + macciv[n1 - 1]);
    }
}


