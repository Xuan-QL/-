import com.manger.PayWithIf;

public class app {
    public static void main(String[] args) {
        PayWithIf payment = new PayWithIf();
        
        while (true) {
        System.out.println("欢迎来到支付系统！");
        payment.main(args);
        System.out.println("=========================");
        }
    }
}