package com.knoldus.max_number;

public class FindMax {

    public int calculateMax(int a, int b) {
        Max max=(num1, num2) -> num1>num2?num1:num2;
        return max.findMaxNumber(a,b);

    }
}







