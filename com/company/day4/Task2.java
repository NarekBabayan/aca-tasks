package com.company.day4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        if(num>=0) {
            if (num % 2 == 0) {
                System.out.println("number is an even");
            } else {
                System.out.println("number is an odd");
            }
        }else{
            System.out.println("write position numbers");
        }
    }
}
