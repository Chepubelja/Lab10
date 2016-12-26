package Factory;

import bouquets.FlowerBucket;
import flowers.Flower;
import flowers.FlowerColor;
import flowers.FlowerSpec;
import flowers.FlowerType;

public class BirthdayBucket extends FlowerBucket {
    private BucketSize size;
    private FlowerSpec spec1 = new FlowerSpec(FlowerType.Peony, 10, true, 10);

    BirthdayBucket(BucketSize z) {
        this.size = z;
        Flower green_peony = new Flower(spec1, FlowerColor.Green);
        Flower blue_peony = new Flower(spec1, FlowerColor.Blue);
        if (z == BucketSize.S) {
            this.addFlowers(green_peony, FlowerColor.Green, 3);
            this.addFlowers(blue_peony, FlowerColor.Blue, 4);
        }
        if (z == BucketSize.M) {
            this.addFlowers(green_peony, FlowerColor.Green, 5);
            this.addFlowers(blue_peony, FlowerColor.Blue, 6);
        }
        if (z == BucketSize.L) {
            this.addFlowers(green_peony, FlowerColor.Green, 9);
            this.addFlowers(blue_peony, FlowerColor.Blue, 10);
        }
    }

    public void addFlowers(Flower flower, FlowerColor color, int amount) {
        if (color == FlowerColor.Green && flower.getType() == FlowerType.Peony ||
                flower.getType() == FlowerType.Peony && color == FlowerColor.Blue){
            Flower new_peony = new Flower(spec1, color);
            super.addFlowers(new_peony, color, amount);
        }
        else
            System.out.println("We have only blue and green peonies for this bucket");
    }
    @Override
    public String toString() {
        return "You have chosen birthday bucket of size " + size;
    }
}
