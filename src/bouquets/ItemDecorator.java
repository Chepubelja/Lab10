package bouquets;

import flowers.Flower;

abstract class ItemDecorator implements Item{
    protected Item item;
    public ItemDecorator(Item _item){
        item = _item;
    }
    public int size() {
        int counter = 0;
        for (int k = 0; k < size(); k++) {
            counter ++;
        }
        return counter;
    }
    public Flower[] getFlower(){
        return item.getFlower();
    }
}
