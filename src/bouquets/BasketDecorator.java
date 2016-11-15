package bouquets;

public class BasketDecorator extends ItemDecorator{

    public BasketDecorator(Item _item) {
        super(_item);
    }

    public double price(){
        return 4 + item.price();
    }
    public String getDescription(){
        return "It is basket wrapper for bouquet with" + item.toString();
    }
}
