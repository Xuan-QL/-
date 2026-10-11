import com.manger.PayWithIf;

public class app {
    public static void main(String[] args) {
        while (true) {
        System.out.println("欢迎来到支付系统！");
        System.out.println("初始都有5千");
        PayWithIf payment = new PayWithIf();
        payment.main(args);
        System.out.println("=========================");
        }
    }
}