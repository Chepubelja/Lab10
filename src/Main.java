import Factory.BucketSize;
import Factory.BucketType;
import Factory.FastOrderFactory;

public class Main {
    public static void main(String[] args) {
//        FlowerSpec spec1 = new FlowerSpec(FlowerType.Chamomile, 10, true, 10);
//        Flower flower1 = new ChamomileFlower(spec1, FlowerColor.Blue);
        FastOrderFactory factory = new FastOrderFactory();
        System.out.println(factory.create(BucketType.BIRTHDAY, BucketSize.S));
        System.out.println(factory.create(BucketType.WEDDING, BucketSize.M));
        System.out.println(factory.create(BucketType.CHAMOMILE, BucketSize.L));
//        factory.create(BucketType.CHAMOMILE, BucketSize.M, FlowerColor.Black);
//        factory.create(BucketType.WEDDING, BucketSize.L, FlowerColor.White);
        //System.out.println(factory);

//        FlowerSpec spec2 = new FlowerSpec(FlowerType.Tulip, 12, false, 8);
//        Flower flower2 = new TulipFlower(spec2, FlowerColor.Green);
//        FlowerBucket newBucket = new FlowerBucket();
//        for (int l = 0; l < 7; l++){
//            newBucket.addFlower(flower1);
//        }
//        for (int l = 0; l < 5; l++){
//            newBucket.addFlower(flower2);
//        }
//
//        PaperDecorator paper = new PaperDecorator(newBucket);
//        RibbonDecorator ribbon = new RibbonDecorator(newBucket);
//        BasketDecorator basket = new BasketDecorator(newBucket);
//
//        Order order = new Order();
//        order.addItem(paper);
//        order.addItem(ribbon);
//        order.addItem(basket);
//        order.setDeliveryStrategy(new DHLDeliveryStrategy());
//        order.setPaymentStrategy(new PayPalPaymentStrategy());
//
//        //order.processOrder();
//        ChamomileSupplierObserver cham = new ChamomileSupplierObserver(order);
//        TulipSupplierObserver tulip = new TulipSupplierObserver(order);
        //order.notifyAllObservers(newBucket);
        //order.adding(cham);
        //order.adding(tulip);
        //newBucket.addFlower(flower1);
        //newBucket.addFlower(flower2);
        //order.notifyAllObservers(newBucket);

    }
}
