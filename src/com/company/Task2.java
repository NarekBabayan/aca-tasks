package com.company;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numDouble=scanner.nextDouble();
        System.out.println("double type=" + numDouble);

        float num1 = (float) numDouble;
        System.out.println("float types=" + num1);

        long num2= (long) num1;
        System.out.println("long types=" + num2);

        int num3= (int) num2;
        System.out.println("int types=" + num3);

        short num4= (short) num3;
        System.out.println("short types=" + num4);

        byte num5= (byte) num4;
        System.out.println("byte types=" + num5);








    }
}
