package com.company;

public class BoneThrow {
    public static void main(String[] args) {
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        int sum5 = 0;
        int sum6 = 0;
        int sum7 = 0;
        int sum8 = 0;
        int sum9 = 0;
        int sum10 = 0;
        int sum11 = 0;
        int sum12 = 0;
        int n = (int) (Math.random() * 10000) + 1000;
        for (int i = 0; i < n; i++) {//System.out.println(c + b);//2 3 4 5 6 7 8 9 10 11 12
            // 1+1 1+2 1+3 1+4 1+5 1+6 2+2 2+3 2+4 2+5 2+6 3+3 3+4 3+5 3+6 4+5 4+6 5+6 6+6
            int c = (int) (Math.random() * 6) + 1;
            int b = (int) (Math.random() * 6) + 1;

            if (b + c == 2) {
                sum2++;
            }
            if (b + c == 3) {
                sum3++;
            }
            if (b + c == 4) {
                sum4++;
            }
            if (b + c == 5) {
                sum5++;
            }
            if (b + c == 6) {
                sum6++;
            }
            if (b + c == 7) {
                sum7++;
            }
            if (b + c == 8) {
                sum8++;
            }
            if (b + c == 9) {
                sum9++;
            }
            if (b + c == 10) {
                sum10++;
            }
            if (b + c == 11) {
                sum11++;
            }
            if (b + c == 12) {
                sum12++;
            }
        }
        System.out.println("сумма на кубика равная 2 выпала: " + sum2 + " из " + n + " раз ");
        System.out.println("сумма на кубика равная 3 выпала: " + sum3 + " из " + n + " раз ");
        System.out.println("сумма на кубика равная 4 выпала: " + sum4 + " из " + n + " раз ");
        System.out.println("сумма на кубика равная 5 выпала: " + sum5 + " из " + n + " раз ");
        System.out.println("сумма на кубика равная 6 выпала: " + sum6 + " из " + n + " раз ");
        System.out.println("сумма на кубика равная 7 выпала: " + sum7 + " из " + n + " раз ");
        System.out.println("сумма на кубика равная 8 выпала: " + sum8 + " из " + n + " раз ");
        System.out.println("сумма на кубика равная 9 выпала: " + sum9 + " из " + n + " раз ");
        System.out.println("сумма на кубика равная 10 выпала: " + sum10 + " из " + n + " раз ");
        System.out.println("сумма на кубика равная 11 выпала: " + sum11 + " из " + n + " раз ");
        System.out.println("сумма на кубика равная 12 выпала: " + sum12 + " из " + n + " раз ");

    }
}