package com.company;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        double radius= scanner.nextDouble();
        double area=3.14159*radius*radius;
        double perimeter =2 * 3.14159 * radius;
        System.out.println("perimeter="+perimeter);
        System.out.println("area="+area);

    }
}
