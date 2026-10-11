package com.impl;


import  com.payment.PayPalment;

public abstract class AbstractPayment implements PayPalment {

    protected double balance = 5000;

    @Override
    public boolean pal(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("已支付" + amount + "元");
            System.out.println("余额还剩" + balance + "元");
            return true;
        } else {
            System.out.println("余额不足");
            return false;
        }
    }
}
