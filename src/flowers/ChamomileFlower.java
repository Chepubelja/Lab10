package flowers;

public class ChamomileFlower extends Flower{
    public ChamomileFlower(FlowerSpec spec, FlowerColor color) {
        super(spec, color);
    }
    public String getName(Flower flower){
        return "ChamomileFlower";
    }
}
