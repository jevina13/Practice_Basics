package com.jev;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExamples {
    public static void main(String[] args) {

        System.out.println("ArrayList example in 1D:");
        ArrayList<Integer> list = new ArrayList<>(10);
        Scanner in = new Scanner(System.in);

        for (int i =0;i<3;i++){
            list.add(in.nextInt()); //adding the eleents in the list
        }

        for (int i =0;i<3;i++){
            System.out.println(list.get(i)); //pass items like this, list[index] doesn't work here
        }


        //Multidimentional arrays
        System.out.println("ArrayList example 2D List:");

        ArrayList<ArrayList<Integer>> listD = new ArrayList<>();

        //initialization
        for (int i=0;i<3;i++){
            listD.add(new ArrayList<>());
        }

        //adding elements
        for (int i=0;i<3;i++){
            for (int j=0; j<3;j++){
                listD.get(i).add(in.nextInt());
            }
        }

        System.out.println(listD);


    }
}
