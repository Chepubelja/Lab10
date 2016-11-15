package bouquets;

public class RibbonDecorator extends ItemDecorator{

    public RibbonDecorator(Item _item) {
        super(_item);
    }

    public double price(){
        return 40 + item.price();
    }
    public String getDescription(){
        return "It is ribbon for bouquet with" + item.toString();
    }
}
