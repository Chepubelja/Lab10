package DeliveryStrategy;
import bouquets.Item;
import java.util.LinkedList;

public class DHLDeliveryStrategy implements IDelivery{
    public String deliver (LinkedList<Item> items){
        String bouquets = "";
        for (Item bouquet: items){
            bouquets += bouquet.getDescription();
        }
        return "You have used DHL delivery type to deliver" + bouquets ;
    }
}
