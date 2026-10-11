package com.impl;

import com.payment.wxPalment;

public class WxchantPayment extends AbstractPayment implements wxPalment {
    @Override
    public String getWxPalmentName() {
        // 返回一个支付方式
        return "微信支付";
    }
    
}