package com.company;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int point1=0, point2 = 0;

        System.out.println("input x1");
        double x1 = scanner.nextDouble();
        System.out.println("input y1");
        double y1 = scanner.nextDouble();
        System.out.println("input x2");
        double x2 = scanner.nextDouble();
        System.out.println("input y2");
        double y2 = scanner.nextDouble();

        if(x1!=0 && y1!=0 && x2!=0 && y1!=0) {

            if (x1 > 0 && y1 > 0) {
                point1 = 1;
            }
            if (x1 > 0 && y1 < 0) {
                point1 = 4;
            }
            if (x1 < 0 && y1 < 0) {
                point1 = 3;
            }
            if (x1 < 0 && y1 > 0) {
                point1 = 2;
            }


            if (x2 > 0 && y2 > 0) {
                point2 = 1;
            }
            if (x2 > 0 && y2 < 0) {
                point2 = 4;
            }
            if (x2 < 0 && y2 < 0) {
                point2 = 3;
            }
            if (x2 < 0 && y2 > 0) {
                point2 = 2;
            }

            if(point1 == point2){
                System.out.println("quarter= " + point1);
            }else {
                System.out.println("do not match");
            }
        }

    }
}
