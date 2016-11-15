package flowers;

public enum  FlowerType {
    Tulip, Chamomile, Peony, Rose;

    public String toString() {
        switch (this){
            case Tulip:
                return "Tulip";
            case Chamomile:
                return "Chamomile";
            case Peony:
                return "Peony";
            case Rose:
                return "Rose";
            default:
                return "No Type";
        }
    }
}
