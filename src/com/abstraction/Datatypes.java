package com.abstraction;

import java.util.Scanner;

public class Datatypes {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int number= sc.nextInt();
        System.out.println(number);





        double b;
        b= sc.nextDouble();
        System.out.println(b);

        float f;
        f= sc.nextFloat();
        System.out.println(f);

        long l;
        l= sc.nextLong();
        System.out.println(l);

        boolean e;
        e= sc.hasNextBoolean();
        System.out.println(e);


    }
}
