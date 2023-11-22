package com.jev;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n= sc.nextInt();
        System.out.println("Which digit count do you want?");
        int find = sc.nextInt();

        int a = 0;
        int b = 1;
       // System.out.print(a+" ");
        for (int i = num;i>=1;i--){
            int sum = a + b;
            int temp = b;
            b = sum;
            System.out.print(a+" ");
            a=temp;
        }

        int count = 0;
        while(n>0){
            int rem = n %10;
            if (rem == find){
                count++;
            }
            n=n/10;
        }
        System.out.println("\n The number "+find +" occurs "+count+" times.");
    }
}
