package com.abstraction;

public class Main {

    public static void main(String[] args) {

        Payment payment1 = new CardMethod();
        Payment payment2 = new UpiMethod();


        payment1.paymentAmount(100);
        System.out.println( payment1.paymentSuccessfulMessage(true));

        payment2.paymentAmount(250);
        System.out.println( payment1.paymentSuccessfulMessage(false));
    }
}
