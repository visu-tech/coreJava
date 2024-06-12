package com.abstraction;

public interface Payment {

    public void paymentAmount(int no);

    public String paymentSuccessfulMessage(boolean paymentStatus);
}
