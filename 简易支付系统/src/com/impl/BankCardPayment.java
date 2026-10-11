package com.impl;

import com.payment.yhPalment;

public class BankCardPayment extends AbstractPayment implements yhPalment {
    @Override
    public String getBankName() {
        // 返回支付方式
        return "工商银行支付";
    }
}