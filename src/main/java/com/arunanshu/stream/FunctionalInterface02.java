package com.arunanshu.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionalInterface02 {
    public static void main(String[] args) {
        List<Integer> l1= Arrays.asList(10,11,12,13,14,15,16);

        //1
        Map<Boolean,List<Integer>>m1=l1.stream().collect(Collectors.partitioningBy(x->x%2==0));
        System.out.println("1  "+m1);

        //2
        List<Integer>l2=Arrays.asList(10,10,10,20,20,40,20,10,11,12,11,13,40);
        List li2 = l2.stream().distinct().toList();
        System.out.println("2  "+li2);

        //3
        String s3="here is what i can do";
        Map<Character,Long> m3 = s3.chars().mapToObj(a->(char)a).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("3 "+m3);

        //4


        //5

    }
}
