package DeliveryStrategy;
import bouquets.Item;
import java.util.LinkedList;

public interface IDelivery {
    public String deliver (LinkedList<Item> items);
}
