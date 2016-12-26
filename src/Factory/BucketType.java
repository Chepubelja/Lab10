package Factory;

public enum BucketType {
    WEDDING, BIRTHDAY, CHAMOMILE;

    @Override
    public String toString() {
        switch (this){
            case WEDDING:
                return "Wedding";
            case BIRTHDAY:
                return "Birthday";
            case CHAMOMILE:
                return "Chamomile";
        }
        return null;
    }
}
