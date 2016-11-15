package flowers;

public abstract class Flower {
    protected FlowerSpec spec;
    protected FlowerColor color;

    public Flower(FlowerType type, FlowerColor color, double length, boolean fresh,  double price){
        this.color = color;
        this.spec = new FlowerSpec(type, length, fresh, price);
    }

    public double price() {
        return spec.price;
    }
    public double getLength() {
        return spec.length;
    }
    public FlowerColor getColor() {
        return color;
    }
    public boolean isFresh() {
        return spec.fresh;
    }
    public FlowerType getType() {
        return spec.getType();
    }
    public String toString() {
        return "Type: " + getType() + " price is " + String.valueOf(price()) + " its color is " + getColor() + " fresh level is " + String.valueOf(isFresh()) + " its height " + String.valueOf(getLength());
    }


}
