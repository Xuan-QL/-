package com.manger;

// import com.impl.BankCardPayment;
// import com.impl.WxchantPayment;
// import com.impl.AbstractPayment;
// import com.impl.Aimplements;
import com.impl.*;
import java.util.Scanner;

public class PayWithIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== 请选择支付方式 =====");
        System.out.println("1. 支付宝");
        System.out.println("2. 微信");
        System.out.println("3. 银行卡");
        System.out.println("4. 查询剩下余额");
        System.out.println("=========================");
        System.out.print("请输入编号：");
        int choice = scanner.nextInt();

        System.out.print("请输入支付金额：");
        
        double amount = scanner.nextDouble();
        Aimplements aliPayment = new Aimplements();
        WxchantPayment wxPayment = new WxchantPayment();
        BankCardPayment bankCardPayment = new BankCardPayment();

        // 判断使用什么方法支付
        if (choice == 1) {
            aliPayment.pal(amount);
            System.out.println(aliPayment.getZfbPalmentName());
        } else if (choice == 2) {
            wxPayment.pal(amount);
            System.out.println(wxPayment.getWxPalmentName());
        } else if (choice == 3) {
            bankCardPayment.pal(amount);
            System.out.println(bankCardPayment.getBankName());
        } else {
            System.out.println("无效的选择！");
        } 
    }
}