import DeliveryStrategy.IDelivery;
import PaymentStrategy.IPayment;
import bouquets.FlowerBucket;
import bouquets.Item;
import flowers.Flower;

import java.util.LinkedList;
import java.util.Objects;

public class Order implements Observable1{
    private int counter = 0;
    public LinkedList<Item> items = new LinkedList<>();
    private IPayment payment;
    private IDelivery delivery;
    private LinkedList<Observer1> observers = new LinkedList<>();
    public Order(){

    }
    public int Flower_search(LinkedList<Item> items, Flower flower){
        for (Item item1 : items){
            for (Flower flowers: item1.getFlower()){
                if(Objects.equals(flowers.getClass().toString(), flower.getClass().toString())){
                    counter ++;
                }
            }
        }
        return counter;
    }

    public void setPaymentStrategy(IPayment _payment){
        payment = _payment;
    }
    public void setDeliveryStrategy(IDelivery _delivery){
        delivery = _delivery;
    }
    public double calculateTotalPrice(){
        double a = 0;
        for (int i = 0; i < items.size(); i++){
            a += items.get(i).price();
        }
        return a;
    }
    public void processOrder(){
        payment.pay(calculateTotalPrice());
        System.out.println(delivery.deliver(items));
    }
    public void addItem(Item b){
        items.add(b);
    }
    public void removeItem(Item b){
        items.remove(b);
    }
    @Override
    public void adding(Observer1 observer) {
        observers.add(observer);
    }
    @Override
    public void notifyAllObservers(FlowerBucket bucket) {
        for (Observer1 observer: observers){
            observer.update(bucket);
        }
    }
    @Override
    public void removing(Observer1 observer) {
        observers.remove(observer);
    }
}
