package lv.rvt;

public class ProductWarehouse extends Warehouse{
    private String name;

    public ProductWarehouse(String name, double capacity) {
        super(capacity);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
