package com.company;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        char myChar= (scanner.nextLine()).charAt(0);
        int  myInt=(int) myChar;
        System.out.println(myInt);
    }
}
