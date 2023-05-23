package com.epam.conditions;

public class BitwiseValuesSwap {

    public void swap(int first, int second) {// 01 10
        first ^= second;// 11 10
        second = first ^ second;
        first ^= second;
        System.out.println(first);
        System.out.println(second);
    }
}
