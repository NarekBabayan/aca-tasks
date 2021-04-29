package com.company;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        int age = scanner.nextInt();
        if (age>=18){
            System.out.println("yes you are can");
        }else if (age>=1){
            System.out.println("no you are not can");
        }else {
            System.out.println("write positive number");
        }
    }
}
