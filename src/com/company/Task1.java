package com.company;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte number = scanner.nextByte();
        System.out.println(number);
        short shortNum;
        shortNum = number;
        System.out.println(shortNum);


        short num= scanner.nextShort();
        System.out.println(num);
        int numI = num;
        System.out.println(numI);

        int numI2= scanner.nextInt();
        System.out.println(numI2);
        long numLong = numI2;
        System.out.println(numLong);

        long numLong2=scanner.nextLong();
        System.out.println(numLong2);
        float numFloat=numLong2;
        System.out.println(numLong2);

        float numFloat2=scanner.nextFloat();
        System.out.println(numFloat2);
        double numDouble=numFloat2;
        System.out.println(numDouble);





    }
}
