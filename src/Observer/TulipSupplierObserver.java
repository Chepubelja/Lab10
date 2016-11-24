package Observer;

import bouquets.FlowerBucket;
import flowers.FlowerColor;
import flowers.FlowerType;
import flowers.TulipFlower;

public class TulipSupplierObserver extends Observer1 {
    private Observable1 subject;

    public TulipSupplierObserver(Observable1 subject) {
        this.subject = subject;
        subject.adding(this);
    }

    public void update(FlowerBucket bucket) {

        int b = bucket.bucket_search_flower(new TulipFlower(FlowerType.Tulip, FlowerColor.Black, 11, true, 14 ));
        System.out.println("There are not enough Tulips, so we need " +
                b + " more");
    }
}
