package Factory;

import bouquets.FlowerBucket;
import flowers.Flower;
import flowers.FlowerColor;
import flowers.FlowerSpec;
import flowers.FlowerType;

public class ChamomileBucket extends FlowerBucket{
    private BucketSize size;
    private FlowerSpec spec1 = new FlowerSpec(FlowerType.Chamomile, 10, true, 10);
    ChamomileBucket(BucketSize z) {
        this.size = z;
        Flower white_chamomile = new Flower(spec1, FlowerColor.White);
        Flower black_chamomile = new Flower(spec1, FlowerColor.Black);
        if (z == BucketSize.S) {
            this.addFlowers(white_chamomile, FlowerColor.White, 3);
            this.addFlowers(black_chamomile, FlowerColor.Black, 4);
        }
        if (z == BucketSize.M) {
            this.addFlowers(white_chamomile, FlowerColor.White, 5);
            this.addFlowers(black_chamomile, FlowerColor.Black, 6);
        }
        if (z == BucketSize.L) {
            this.addFlowers(white_chamomile, FlowerColor.White, 9);
            this.addFlowers(black_chamomile, FlowerColor.Black, 10);
        }
    }
    @Override
    public void addFlowers(Flower flower, FlowerColor color, int amount) {
        if (color == FlowerColor.White && flower.getType() == FlowerType.Chamomile ||
                color == FlowerColor.Black && flower.getType() == FlowerType.Chamomile ){
            Flower new_chamomile = new Flower(spec1, color);
            super.addFlowers(new_chamomile, color, amount);
        }
        else
            System.out.println("We have only white and black chamomiles for this bucket");
    }
    @Override
    public String toString() {
        return "You have chosen chamomile bucket of size " + size;
    }
}

