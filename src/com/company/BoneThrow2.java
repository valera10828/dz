package com.company;

import java.io.*;
import java.util.Arrays;

public class BoneThrow2 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        int bones;
        do {
            System.out.println("введите пожалуйста количество кубиков от 0 до 10");
            bones = Integer.parseInt(bufferedReader.readLine()); //читаем строку с клавиатуры
        } while (bones > 10 || bones < 0);
        int amount = 1000 + (int) (Math.random() * 9000);
        int[] summs = new int[amount];
        for (int i = 0; i < amount; i++) {
            int summa = 0;
            for (int j = 0; j < bones; j++) {
                summa += (int) (Math.random() * 6) + 1;
                System.out.print("вы бросили " + bones + " кубика,");
                System.out.println(" их сумма равна " + summa);
            }
            summs[i] = summa;
        }
        Arrays.sort(summs);
        System.out.println(Arrays.toString(summs));
        int seria = 0;
        int temp = 0;
        int s = 0;
        for (int i = 1; i < summs.length; i++) {
            temp = summs[i];
            if (temp == summs[i - 1]) {
                seria++;
            } else {
                seria = 0;
                s = temp;
            }
        }
    }
}
