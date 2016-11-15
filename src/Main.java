import DeliveryStrategy.DHLDeliveryStrategy;
import PaymentStrategy.PayPalPaymentStrategy;
import bouquets.BasketDecorator;
import bouquets.FlowerBucket;
import bouquets.PaperDecorator;
import bouquets.RibbonDecorator;
import flowers.*;

public class Main {
    public static void main(String[] args) {
        Flower flower1 = new ChamomileFlower(FlowerType.Chamomile, FlowerColor.Black, 10, true, 10);
        Flower flower2 = new TulipFlower(FlowerType.Tulip, FlowerColor.Green, 12, false, 8);
        FlowerBucket newBucket = new FlowerBucket();
        newBucket.addFlower(flower1);
        newBucket.addFlower(flower2);

        PaperDecorator paper = new PaperDecorator(newBucket);
        RibbonDecorator ribbon = new RibbonDecorator(newBucket);
        BasketDecorator basket = new BasketDecorator(newBucket);

        Order order = new Order();
        order.addItem(paper);
        order.addItem(ribbon);
        order.addItem(basket);
        order.setDeliveryStrategy(new DHLDeliveryStrategy());
        order.setPaymentStrategy(new PayPalPaymentStrategy());

        order.processOrder();


    }
}
