package lv.rvt;

public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory historyManager;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);

        this.historyManager = new ChangeHistory();
        historyManager.add(initialBalance);
    }

    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        historyManager.add(super.getBalance());
    }
    
    public double takeFromWarehouse(double amount) {
        double amountGot = super.takeFromWarehouse(amount);
        historyManager.add(super.getBalance());
        return amountGot;
    }

    public void printAnalysis() {
        System.out.printf("Product: %s\nHistory: %.1f\nLargest amount of product: %.1f\nSmallest amount of product: %.1f\nAverage: %.1f",
        super.getName(),
        historyManager.toString(),
        historyManager.maxValue(),
        historyManager.minValue(),
        historyManager.average()
        );
    }

    public String history() {
        return historyManager.toString();
    }
}
