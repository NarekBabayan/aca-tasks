package com.company.day4;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        float num =scanner.nextFloat();

        if(num==0){
            System.out.println("number is Zero");
        }
        if (num<0){
            System.out.println("number is negative");
        } else if(num!=0){
            System.out.println("number is position");
        }

        if(Math.abs(num)<1){
            System.out.println("small");
        }else if(Math.abs(num)>1000000){
            System.out.println("large");
        }
    }
}
