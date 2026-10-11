package com.manger;

import com.impl.BankCardPayment;
import com.impl.WxchantPayment;
import com.payment.zfbPalment;
import com.impl.Aimplements;
import java.util.Scanner;

public class PayWithIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== 请选择支付方式 =====");
        System.out.println("1. 支付宝");
        System.out.println("2. 微信");
        System.out.println("3. 银行卡");
        System.out.println("=========================");
        System.out.print("请输入编号：");
        int choice = scanner.nextInt();

        System.out.print("请输入支付金额：");
        
        double amount = scanner.nextDouble();
        

        // 判断使用什么方法支付
        if (choice == 1) {
            Aimplements aliPayment = new Aimplements();
            aliPayment.pal(amount);
            System.out.println(aliPayment.getZfbPalmentName());
        } else if (choice == 2) {
            WxchantPayment wxPayment = new WxchantPayment();
            wxPayment.pal(amount);
            System.out.println(wxPayment.getWxPalmentName());
        } else if (choice == 3) {
            BankCardPayment bankCardPayment = new BankCardPayment();
            bankCardPayment.pal(amount);
            System.out.println(bankCardPayment.getBankName());
        }else {
            System.out.println("无效的选择！");
        } 
    }
}