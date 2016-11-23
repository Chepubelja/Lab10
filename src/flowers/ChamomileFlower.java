package flowers;

public class ChamomileFlower extends Flower{
    public ChamomileFlower(FlowerType type, FlowerColor color, double length, boolean fresh, double price) {
        super(type, color, length, fresh, price);
    }
    public String getName(Flower flower){
        return "ChamomileFlower";
    }
}
