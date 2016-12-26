package Factory;

public enum BucketSize {
    S, M, L;

    @Override
    public String toString() {
        switch (this) {
            case S:
                return "S";
            case M:
                return "M";
            case L:
                return "L";
        }
        return null;
    }
}
