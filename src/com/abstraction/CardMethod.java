package com.abstraction;

public class CardMethod implements Payment{
    public void paymentAmount(int no) {
        System.out.println("payment amount is" + no);
    }

    @Override
    public String paymentSuccessfulMessage(boolean paymentStatus) {
        return paymentStatus ?"successful":"unsuccessful";
    }
}
