package Question_1.com;

class PaymentUsingCreditCard implements paymentType{
    @Override
    public boolean pay(double amount) {
        System.out.println("Payment Through credit card");
        return true;
    }
}


