package com.company;

public class TypeOfData {
    public static void main(String[] args) {
        byte b;
        b = 102;//256 чисел
        short s = 1024;//66536 чисел
        int i = 10241024;//больше 4 млрд чисел
        Integer integer = i;
        Short Short = s;
        Byte Byte = b;
        System.out.println(integer.MAX_VALUE);
        System.out.println(integer.MIN_VALUE);
        System.out.println(integer.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);


    }
}
