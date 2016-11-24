package Observer;

import bouquets.FlowerBucket;
import bouquets.Item;
import flowers.Flower;

import java.util.LinkedList;

public interface Observable1 {
        public int Flower_search(LinkedList<Item> items, Flower flower);

        public void removing(Observer1 obs1) ;

        public void adding(Observer1 obs1);

        public void notifyAllObservers(FlowerBucket bucket);
}
