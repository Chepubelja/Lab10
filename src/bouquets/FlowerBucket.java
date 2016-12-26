package bouquets;

import flowers.Flower;
import flowers.FlowerColor;
import flowers.FlowerSpec;

import java.util.ArrayList;
import java.util.Objects;

public class FlowerBucket implements Item {
    private int defaultSize = 10;

    private int insertIndex = 0; // insert, or better create method length()
    private Flower[] a = new Flower[defaultSize];

    public String getDescription() {
        return "";
    }

    public int bucket_search_flower(Flower flower) {
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == null)
                continue;
            if (Objects.equals(a[i].getClass().toString(), flower.getClass().toString())) {
                counter++;
            }
        }
        return counter;
    }

    public void addFlower(Flower nw) {
        checkSize();
        a[insertIndex] = nw;
        insertIndex++;
    }
    public void addFlowers(Flower flower, FlowerColor color, int amount){
        checkSize();
        for (int i = 0; i < amount; i++)
            a[insertIndex] = flower;
        insertIndex++;
    }

    private void checkSize() {
        if (insertIndex == defaultSize - 1) {
            defaultSize *= 2;
            Flower[] b = new Flower[defaultSize];
            for (int i = 0; i <= insertIndex; i++) {
                b[i] = a[i];
            }
            a = b;
        }
    }

    public void sortByPrice() {
        for (int i = 1; i < insertIndex; i++) {
            Flower tmp = a[i];
            int j = i - 1;
            while (j >= 0 && (a[i].price() < a[j].price())) {
                a[i] = a[j];
                j--;
            }
            a[j + 1] = tmp;
        }
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < insertIndex; i++) {
            s += a[i].toString() + "\n";
        }
        return s;
    }

    public double price() {
        double sum = 0;
        for (Flower flower : a) {
            if (flower != null) {
                sum += flower.price();
            } else {
                break;
            }
        }
        return sum;
    }

    @Override
    public Flower[] getFlower() {
        return a;
    }

    @Override
    public int size() {
        return 0;
    }

    public Flower[] selectFlowersByItsLength(double start, double end) {
        int tmpSize = 0;
        for (int i = 0; i < insertIndex; i++) {
            if (a[i].getLength() <= end && a[i].getLength() >= start) {
                tmpSize++;
            }
        }
        Flower[] tmpPart = new Flower[tmpSize];
        int tmpIndex = 0;
        for (int i = 0; i < insertIndex; i++) {
            if (a[i].getLength() <= end && a[i].getLength() >= start) {
                tmpPart[tmpIndex] = a[i];
                tmpIndex++;
            }
        }
        return tmpPart;
    }

    public ArrayList<Flower> getFlower(FlowerSpec type1) {

        ArrayList<Flower> tmp = new ArrayList<Flower>();
        for (int i = 0; i < insertIndex; i++) {
            if (a[i].getType().equals(type1.getType())) {
                tmp.add(a[i]);
            }
        }

        return tmp;
    }

    public Flower searchFlower(Flower flower) {

        ArrayList<Flower> tmp = new ArrayList<Flower>();
        for (int i = 0; i < insertIndex; i++) {
            if (a[i].getType() != flower.getType())
                continue;
            if (a[i].getColor() != flower.getColor())
                continue;
            if (a[i].getLength() != flower.getLength())
                continue;
            return a[i];
        }

        return null;
    }
}