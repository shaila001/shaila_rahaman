package Question_1.com;

class paymentUsingBkash implements paymentType{
    @Override
    public boolean pay(double amount) {
        System.out.println("Payment Through bkash");
        return true;
    }
}
