package com.jev;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = 0;
        while (num>0){
            rev=(rev*10)+(num%10);
            num=num/10;
            int c =100;
        }
        int c=23;
        System.out.println("The value= "+c);
        System.out.println("The reverse of a number is: "+rev);
    }
}
