package com.jev;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean ans= isPrime(num);
        System.out.println(num+" "+ans);
        int armNo = sc.nextInt();
        boolean ans1= isArmstrong(armNo);
        System.out.println(armNo+" "+ans1);
    }

    static boolean isPrime(int n){

        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    static boolean isArmstrong(int n){
        int og = n;
        int temp=0;

        while(n/10!=0){
            temp = (n%10 *10) + temp;
            n=n/10;
        }

        if(temp==og){
            return true;
        }

        return false;

    }

}
