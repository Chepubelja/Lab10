package flowers;

public enum FlowerColor {
    Black, Red, Blue, Green, White;
    public String toString() {
        switch (this) {
            case Black:
                return "Black";
            case Red:
                return "Red";
            case Blue:
                return "Blue";
            case Green:
                return "Green";
            case White:
                return "White";
            default:
                return "Colorless";
        }
    }
}
