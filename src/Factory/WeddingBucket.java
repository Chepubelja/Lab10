package Factory;

import bouquets.FlowerBucket;
import flowers.*;

public class WeddingBucket extends FlowerBucket{
    private BucketSize size;
    private FlowerSpec spec1 = new FlowerSpec(FlowerType.Rose, 10, true, 10);
    WeddingBucket(BucketSize z) {
        this.size = z;
        Flower white_roses = new Flower(spec1, FlowerColor.White);
        Flower red_roses = new Flower(spec1, FlowerColor.Red);
        if (z == BucketSize.S) {
            this.addFlowers(white_roses, FlowerColor.White, 3);
            this.addFlowers(red_roses, FlowerColor.Red, 4);
        }
        if (z == BucketSize.M) {
            this.addFlowers(white_roses, FlowerColor.White, 7);
            this.addFlowers(red_roses, FlowerColor.Red, 5);
        }
        if (z == BucketSize.L) {
            this.addFlowers(white_roses, FlowerColor.White, 9);
            this.addFlowers(red_roses, FlowerColor.Red, 10);
        }

    }
    @Override
    public void addFlowers(Flower flower, FlowerColor color, int amount) {
        if (color == FlowerColor.White && flower.getType() == FlowerType.Rose ||
                color == FlowerColor.Red && flower.getType() == FlowerType.Rose ){
            Flower new_rose = new Flower(spec1, color);
            super.addFlowers(new_rose, color, amount);
        }
        else
            System.out.println("We have only white and red roses for this bucket");
    }

    @Override
    public String toString() {
        return "You have chosen wedding bucket of size " + size;
    }
}
