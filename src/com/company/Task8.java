package com.company;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        char myChar= (scanner.nextLine()).charAt(0);
        char myChar1= (scanner.nextLine()).charAt(0);
        char myChar2= (scanner.nextLine()).charAt(0);
        char myChar3= (scanner.nextLine()).charAt(0);

        int  myInt=(int) myChar;
        int  myInt1=(int) myChar1;
        int  myInt2=(int) myChar2;
        int  myInt3=(int) myChar3;

        System.out.println((myInt+myInt1+myInt2+myInt3)/2);
    }
}
