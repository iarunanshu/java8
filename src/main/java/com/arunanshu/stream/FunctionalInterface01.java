package com.arunanshu.stream;

import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class FunctionalInterface01 {
    public static void main(String[] args) {
        List<Integer>li=List.of(10,20,30,25,35,60,85);

        Predicate<Integer>predicate=new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer%10==0;
            }
        };
        li.stream().filter(predicate).forEach(System.out::println);

        Supplier<Integer>supplier=new Supplier<Integer>() {
            @Override
            public Integer get() {
                return 20;
            }
        };
    }
}
