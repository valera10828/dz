package com.company;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;

public class Tree {
    public static void main(String[] args) throws IOException {
        Map<Integer, Integer> bones = new TreeMap<>();
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        int bones1;
        do {
            System.out.println("введите пожалуйста количество кубиков от 10 до 20");
            bones1 = Integer.parseInt(bufferedReader.readLine()); //читаем строку с клавиатуры
        } while (bones1 > 20 || bones1 < 10);
        int amount = 1000 + (int) (Math.random() * 100000);
        for (int i = 0; i < amount; i++) {
            int sum = 0;
            for (int j = 0; j < bones1; j++) {
                int bone = (int) (Math.random() * 6) + 1;
                sum += bone;
            }
            int x = 0;
            if (bones.containsKey(sum)) {
                x = bones.get(sum);
            }

            bones.put(sum, 1 + x);
        }
        bones.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
    }
}
