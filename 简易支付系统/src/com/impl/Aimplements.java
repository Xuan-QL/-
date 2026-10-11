package com.impl;

import com.payment.zfbPalment;

public class Aimplements implements zfbPalment {
    @Override
    public String getZfbPalmentName() {
        // 返回支付方式
        return "支付宝支付";
    }

    @Override 
    public boolean pal(double amount) {
         // 初始值可以修改
        double balance = 5000;
        // 判断输入的价格是否超过5000
        if (amount <= balance) {
            System.out.println("已支付" + amount + "元");
            balance -= amount;
            System.out.println("余额还剩" + balance + "元");
            return true;
        } else {
            System.out.println("余额不足");
            return false;
        }
    }
}