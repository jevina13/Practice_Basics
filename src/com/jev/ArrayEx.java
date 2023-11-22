package com.jev;

import java.util.Arrays;

public class ArrayEx {
    public static void main(String[] args) {
        int[][] arr ={
                {1,2,3},
                {4,5},
                {55,7,8}
        };

        for (int row=0;row<arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }

//        for(int[] a: arr){
//            System.out.println();
//        }
    }
}
