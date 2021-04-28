 package com.company;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.nextLine();
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(num1+num2);
        System.out.println(myString+num1+num2);
    }
}
