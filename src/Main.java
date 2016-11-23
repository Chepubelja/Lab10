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
        for (int l = 0; l < 7; l++){
            newBucket.addFlower(flower1);
        }
        for (int l = 0; l < 5; l++){
            newBucket.addFlower(flower2);
        }

        PaperDecorator paper = new PaperDecorator(newBucket);
        RibbonDecorator ribbon = new RibbonDecorator(newBucket);
        BasketDecorator basket = new BasketDecorator(newBucket);

        Order order = new Order();
        order.addItem(paper);
        order.addItem(ribbon);
        order.addItem(basket);
        order.setDeliveryStrategy(new DHLDeliveryStrategy());
        order.setPaymentStrategy(new PayPalPaymentStrategy());

        //order.processOrder();
        ChamomileSupplierObserver cham = new ChamomileSupplierObserver(order);
        TulipSupplierObserver tulip = new TulipSupplierObserver(order);
        //order.notifyAllObservers(newBucket);
        //order.adding(cham);
        //order.adding(tulip);
        //newBucket.addFlower(flower1);
        //newBucket.addFlower(flower2);
        order.notifyAllObservers(newBucket);

    }
}
