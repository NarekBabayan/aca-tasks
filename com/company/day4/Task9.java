package com.company.day4;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("write year");
        int year= scanner.nextInt();
        if(year>=1) {
            if (year % 4 == 0 && year%100!=0) {
                System.out.println("leap year");
            }
            if(year%400==0){
                System.out.println("leap year");
            }
            if(year%4!=0){
                System.out.println("it is not leap year");
            }

        }else{
            System.out.println("write positive numbers");
        }
    }
}
