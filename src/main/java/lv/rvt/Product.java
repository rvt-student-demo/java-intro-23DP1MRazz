package lv.rvt;

public class Product {
    private String name;
    private String location;
    private int weight;

    public Product(String name, String location, int weight) {
        this.name = name;
        this.location = location;
        this.weight = weight;
    }

    public Product(String name) {
        this(name, "shelf", 0);
    }
    
    public Product(String name, String location) {
        this(name, location, 0);
    }

    public Product(String name, int weight) {
        this(name, "shelf", weight);
    }

    public String toString() {
        return name + " (" + weight + "kg) can be found from the " + location;
    }
}