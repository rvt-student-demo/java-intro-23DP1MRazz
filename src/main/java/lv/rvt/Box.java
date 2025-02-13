package lv.rvt;

import java.util.ArrayList;

public class Box implements Packable{
    private double capacity;
    private int items;
    private ArrayList<Packable> inTheBox;

    public Box(double capacity) {
        this.capacity = capacity;
        this.items = 0;
        this.inTheBox = new ArrayList<>();
    }

    public void add(Packable object) {
        if ((this.capacity - this.weight()) >= object.weight()) {
            this.inTheBox.add(object);
            this.weight();
            this.items++;
        }
    }

    public double weight() {
        double weight = 0;
        for (Packable item : inTheBox) {
            weight += item.weight();
        }
        return weight;
    }

    public String toString() {
        return String.format("Box: %d items, total weight %.1f kg", this.items, this.weight());
    }
}
