package Observer;
import bouquets.FlowerBucket;
import flowers.ChamomileFlower;
import flowers.FlowerColor;
import flowers.FlowerType;

public class ChamomileSupplierObserver extends Observer1 {
    private Observable1 subject;
    public ChamomileSupplierObserver(Observable1 subject){
        this.subject = subject;
        subject.adding(this);
    }

    public void update(FlowerBucket bucket) {
        int b = bucket.bucket_search_flower(new ChamomileFlower(FlowerType.Chamomile, FlowerColor.Black, 11, true, 14 ));
        System.out.println("There are not enough Chamomiles, so we need " +
                b + " more");
    }
}
