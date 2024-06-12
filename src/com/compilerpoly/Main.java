package com.compilerpoly;

public class Main {
    public static void main(String[] args) {
        Addition add=new Addition();

        System.out.println(add.doAddition(3,6));

        System.out.println( add.doAddition(23,2,6));
        System.out.println(add.doAddition(12,13));
    }
}
