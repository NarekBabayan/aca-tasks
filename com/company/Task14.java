package com.company;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double a= scanner.nextDouble();
        double b= scanner.nextDouble();
        double c= scanner.nextDouble();

        if(a>0 && b>0 && c>0){

            if(a+b>c && a+c>b && b+c>a ){
                System.out.println("is Triangle");
            }else{
                System.out.println("it is not Triangle");
            }
        }else{
            System.out.println(" write positive numbers");
        }

    }
}
