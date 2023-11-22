package com.jev;

import javax.xml.transform.stream.StreamSource;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Stream {

    public static void main(String[] args) {

        //private java.util.Arrays Arrays;
        List<Integer> numbs = Arrays.asList(1, 2, 3, 4);
        List<Integer> result = numbs.stream()
                .filter(e -> (e%2) == 0)
                .map(e -> e * 2)
                .collect(toList());

        System.out.println(result);
        System.out.println(numbs);
        numbs.forEach(n -> System.out.println(n));


        List<Integer> number = Arrays.asList(2, 3, 4, 5);

        // demonstration of reduce method
        int even
                = number.stream()
                .filter(x -> x % 2 == 0)
                .reduce(0, (ans, i) -> ans + i);

        System.out.println(even);
    }
}
