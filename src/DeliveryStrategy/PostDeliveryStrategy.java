package DeliveryStrategy;

import bouquets.Item;

import java.util.LinkedList;

public class PostDeliveryStrategy implements IDelivery {
    public String deliver (LinkedList<Item> items){
        String bouquets = "";
        for (Item bouquet: items){
            bouquets += bouquet.getDescription();
        }
        return "You have used delivery by post for " + bouquets;
    }
}
