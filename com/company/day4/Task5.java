package com.company.day4;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        int num3=scanner.nextInt();
        int max;

        if(num1>=num2){
            max=num1;
        }else {
            max=num2;
        }

        if (max>=num3){
            max=max;
        }else{
            max=num3;
        }

        System.out.println("max= "+max);
    }
}
