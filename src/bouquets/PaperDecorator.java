package bouquets;

public class PaperDecorator extends ItemDecorator{

    public PaperDecorator(Item _item) {
        super(_item);
    }

    public double price(){
        return 13 + item.price();
    }
    public String getDescription(){
        return "It is paper wrapper for bouquet with" + item.toString();
        }
}

