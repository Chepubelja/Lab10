package PaymentStrategy;

public class CreditCardPaymentStrategy implements IPayment{
    public void pay (double price){
        System.out.println("You have paid" + price + " with CreditCard");
    }
}
