package com.company;

public class DZ {
    public static void main(String[] args) {
        int summa = 0;
        int prisvedenie = 1;
        for (int a = 0; a < 51; ++a) {
            summa += a;
            prisvedenie *= a;

        }
        System.out.println(" сумма = " + summa);
        System.out.println(" произведение = " + prisvedenie);
    }

}
