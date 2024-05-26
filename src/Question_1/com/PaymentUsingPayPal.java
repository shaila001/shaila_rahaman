package Question_1.com;
public class PaymentUsingPayPal {
    class PaymentUsingPayPal implements paymentType{
        @Override
        public boolean pay(double amount) {
            System.out.println("Payment Through credit card");
            return true;
        }
    }
}
