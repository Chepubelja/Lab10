package PaymentStrategy;

public class PayPalPaymentStrategy implements IPayment{
    public void pay (double price){
        System.out.println("You have paid" + price + " with PayPal");
    }
}
