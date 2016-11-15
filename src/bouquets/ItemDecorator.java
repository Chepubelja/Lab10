package bouquets;

abstract class ItemDecorator implements Item{
    protected Item item;
    public ItemDecorator(Item _item){
        item = _item;
    }
}
