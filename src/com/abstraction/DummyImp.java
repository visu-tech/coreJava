package com.abstraction;

public class DummyImp extends Dummy  implements Payment{

    @Override
    void dummymethod() {
        System.out.println("inside the dummy method");
    }


    @Override
    public void paymentAmount(int no) {

    }

    @Override
    public String paymentSuccessfulMessage(boolean paymentStatus) {
        return "";
    }
}
