package com.jev;

import java.util.Scanner;

public class Primitives {

    public static void main(String[] args) {
        //below are the primitive classes you cannot divide any further
        int rollNo = 90;
        char letter='j';
        float marks=9.9f;
        double largeDecimalNumber = 352453463.45;
        long largeInteger = 579521L;
        boolean check = true;

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Numbers "+a+" "+b);
    }
}
