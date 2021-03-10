package com.company;

import java.util.Arrays;

public class BubbleSort {
    public BubbleSort(int[] macciv) {
    }

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
        System.out.println(Arrays.toString(macciv));

    }
}