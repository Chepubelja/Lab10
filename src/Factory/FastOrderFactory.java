package Factory;
import bouquets.FlowerBucket;

public class FastOrderFactory {
    public FlowerBucket create(BucketType type, BucketSize size){
        switch (type){
            case WEDDING:
                if (size.equals(BucketSize.S)){
                    return new WeddingBucket(BucketSize.S);
                }
                else if (size.equals(BucketSize.M)) {
                    return new WeddingBucket(BucketSize.M);
                }
                else if (size.equals(BucketSize.L)) {
                    return new WeddingBucket(BucketSize.L);
                }
            case BIRTHDAY:
                if (size.equals(BucketSize.S)){
                    return new BirthdayBucket(BucketSize.S);
                }
                else if (size.equals(BucketSize.M)){
                    return new BirthdayBucket(BucketSize.M);
                }
                else if (size.equals(BucketSize.L)){
                    return new BirthdayBucket(BucketSize.L);
                }
            case CHAMOMILE:
                if (size.equals(BucketSize.S)){
                    return new ChamomileBucket(BucketSize.S);
                }
                else if (size.equals(BucketSize.M)){
                    return new ChamomileBucket(BucketSize.M);
                }
                else if (size.equals(BucketSize.L)){
                    return new ChamomileBucket(BucketSize.L);
                }
        }
        return null;
    }
}
