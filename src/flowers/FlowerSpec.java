package flowers;

public class FlowerSpec {
    protected FlowerType type;
    protected double length = 0;
    protected boolean fresh = false;
    protected double price = 0;

    public FlowerSpec(FlowerType type, double length, boolean fresh, double price){
        this.type = type;
        this.price = price;
        this.length = length;
        this.fresh = fresh;
    }
    public FlowerType getType() {
        return type;
    }
}
