package flowers;

public class Flower {
    protected FlowerSpec spec;
    protected FlowerColor color;

    public Flower(FlowerSpec spec, FlowerColor color){
        this.color = color;
        this.spec = new FlowerSpec(spec.type, spec.length, spec.fresh, spec.price);
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
