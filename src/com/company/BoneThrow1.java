package com.company;

public class BoneThrow1 {
    public static void main(String[] args) {
        //3 кубика
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
        int sum13 = 0;
        int sum14 = 0;
        int sum15 = 0;
        int sum16 = 0;
        int sum17 = 0;
        int sum18 = 0;
        int n = (int) (Math.random() * 9000) + 1000;
        for (int i = 0; i < n; i++) {
            int c = (int) (Math.random() * 6) + 1;
            int b = (int) (Math.random() * 6) + 1;
            int a = (int) (Math.random() * 6) + 1;
            if (b + c + a == 3) {
                sum3++;
            }
            if (b + c + a == 4) {
                sum4++;
            }
            if (b + c + a == 5) {
                sum5++;
            }
            if (b + c + a == 6) {
                sum6++;
            }
            if (b + c + a == 7) {
                sum7++;
            }
            if (b + c + a == 8) {
                sum8++;
            }
            if (b + c + a == 9) {
                sum9++;
            }
            if (b + c + a == 10) {
                sum10++;
            }
            if (b + c + a == 11) {
                sum11++;
            }
            if (b + c + a == 12) {
                sum12++;
            }
            if (b + c + a == 13) {
                sum13++;
            }
            if (b + c + a == 14) {
                sum14++;
            }
            if (b + c + a == 15) {
                sum15++;
            }
            if (b + c + a == 16) {
                sum16++;
            }
            if (b + c + a == 17) {
                sum17++;
            }
            if (b + c + a == 18) {
                sum18++;
            }
        }
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
        System.out.println("сумма на кубика равная 13 выпала: " + sum13 + " из " + n + " раз ");
        System.out.println("сумма на кубика равная 14 выпала: " + sum14 + " из " + n + " раз ");
        System.out.println("сумма на кубика равная 15 выпала: " + sum15 + " из " + n + " раз ");
        System.out.println("сумма на кубика равная 16 выпала: " + sum16 + " из " + n + " раз ");
        System.out.println("сумма на кубика равная 17 выпала: " + sum17 + " из " + n + " раз ");
        System.out.println("сумма на кубика равная 18 выпала: " + sum18 + " из " + n + " раз ");
    }
}
