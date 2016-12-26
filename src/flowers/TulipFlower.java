package flowers;

public class TulipFlower extends Flower {
    public TulipFlower(FlowerSpec spec, FlowerColor color) {
        super(spec, color);
    }
    public String getName(Flower flower){
        return "TulipFlower";
    }
}

