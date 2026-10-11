package com.impl;

import com.payment.zfbPalment;

public class Aimplements extends AbstractPayment implements zfbPalment {
    @Override
    public String getZfbPalmentName() {
        // 返回支付方式
        return "支付宝支付";
    }
}