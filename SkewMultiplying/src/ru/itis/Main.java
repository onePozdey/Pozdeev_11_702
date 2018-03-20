package ru.itis;

import java.util.Scanner;

//public class Main {
//    public static dwouble countingCos(double x1, double y1, double x0, double y0) {
//        double x = x1 -x0;
//        double y = y1 - y0;
//        double squareX = x *x;
//        double squareY = y * y;
//        double squares = squareX + squareY;
//        double sqrt = Math.sqrt(squares);
//        double cos = x / sqrt;
//        return cos;
//    }

//    public static void main(String[] args) {
//        Scanner reader = new Scanner(System.in);
//        System.out.println("enter beginning XY");
//        double beginX = reader.nextInt();
//        double beginY = reader.nextInt();
//        System.out.println("enter end XY");
//        double endX = reader.nextInt();
//        double endY = reader.nextInt();
//        System.out.println("enter point to check");
//        double checkX = reader.nextInt();
//        double checkY = reader.nextInt();
//
//        double cos = countingCos(endX, endY, beginX, beginY);
//        double checkCos = countingCos(checkX, checkY, beginX, beginY);
//        double nonCos = -1 * cos;
//
//        if((cos == checkCos) || (nonCos == checkCos)) {
//            System.out.println("point is on the vector");
//        } else if ((checkCos > nonCos) && (checkCos > cos)) {
//            System.out.println("point is under the vector");
//        } else {
//            System.out.println("point is above the vector");
//        }
//    }
//}
