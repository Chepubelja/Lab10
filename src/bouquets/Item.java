package bouquets;

import flowers.Flower;

public interface Item {
    String getDescription();
    double price();

    Flower[] getFlower();
    int size();
}
