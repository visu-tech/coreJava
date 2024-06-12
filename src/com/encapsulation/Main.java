package com.encapsulation;

public class Main {
    public static void main(String[] args) {
        First f= new First();
        f.getA();
        System.out.println(f.getA());
        System.out.println(f.getC());
        f.setA(12);
        System.out.println(f);
        f.setD(12.4);
        System.out.println(f);

    }
}
