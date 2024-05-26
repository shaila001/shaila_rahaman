package Question_1.com;

class paymentUsingBank implements paymentType{
    @Override
    public boolean pay(double amount) {
        System.out.println("Payment Through pay pal card");
        return true;
    }
}
