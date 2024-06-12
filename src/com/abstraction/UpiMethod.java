package com.abstraction;

public class UpiMethod implements Payment{
    @Override
    public void paymentAmount(int no) {
        System.out.println("payment amount is" + no);
    }

    @Override
    public String paymentSuccessfulMessage(boolean paymentStatus) {
        return paymentStatus ?"successful":"unsuccessful";//tenary opeator
    }
}
