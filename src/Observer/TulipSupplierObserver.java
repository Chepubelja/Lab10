package Observer;

import bouquets.FlowerBucket;
import flowers.FlowerColor;
import flowers.FlowerSpec;
import flowers.FlowerType;
import flowers.TulipFlower;

public class TulipSupplierObserver extends Observer1 {
    private Observable1 subject;

    public TulipSupplierObserver(Observable1 subject) {
        this.subject = subject;
        subject.adding(this);
    }

    public void update(FlowerBucket bucket) {
        FlowerSpec spec = new FlowerSpec(FlowerType.Tulip,11, true, 14 );
        int b = bucket.bucket_search_flower(new TulipFlower(spec, FlowerColor.Black));
        System.out.println("There are not enough Tulips, so we need " +
                b + " more");
    }
}
