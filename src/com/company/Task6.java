package com.company;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        char let1=(scanner.nextLine()).charAt(0);
        char let2=(scanner.nextLine()).charAt(0);
        char let3=(scanner.nextLine()).charAt(0);
        int age = scanner.nextInt();
        System.out.println("name is "+let1+let2+let3+" age is "+ age);
    }
}
