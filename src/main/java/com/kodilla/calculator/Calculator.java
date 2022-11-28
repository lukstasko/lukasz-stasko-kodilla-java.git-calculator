package com.kodilla.calculator;

public class Calculator {
    public void add(int a, int b) {
        System.out.println( a +"+"+ b+"="+(a+b));
    }

    public void sub(int a, int b) {
        System.out.println(  a +"-"+ b+"="+ (a-b));
    }


    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        calculator.add(1,5);
        calculator.sub(5,2);

    }
}