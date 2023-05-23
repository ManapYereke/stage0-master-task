package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        String num = "";
        while (number > 0) {
            num += Integer.toString(number % 10);
            number /= 10;
        }
        System.out.println(num);
    }

}
