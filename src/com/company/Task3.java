package com.company;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        double far= scanner.nextDouble();
        double celsius= (far-32)*5/9;
        System.out.println("celsius="+celsius);
    }
}
