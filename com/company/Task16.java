package com.company;

import javax.swing.text.Style;
import java.util.Scanner;

public class Task16 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double a= scanner.nextDouble();
        double b= scanner.nextDouble();
        double c= scanner.nextDouble();
        double discriminant;
        double x1;
        double x2;

        discriminant= Math.pow(b,2)-4*a*c;

        if(discriminant>0){
            x1=(-b-Math.pow(discriminant,0.5))/2*a;
            x2=(-b+Math.pow(discriminant,0.5))/2*a;
            System.out.println("x1 = "+x1);
            System.out.println("x2 = "+x2);
        }
        if (discriminant==0){
            x1=-b/2*a;
            System.out.println("x1 = "+ x1);
        }
        if(discriminant<0){
            System.out.println("There is not solution");
        }


    }
}
