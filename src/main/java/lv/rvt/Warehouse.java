package lv.rvt;

public class Warehouse {
    private double capacity;
    private double balance;

    public Warehouse(double capacity) {
        if (capacity <= 0) {
            this.capacity = 0;
        }
        this.capacity = capacity;
    }

    public void addToWarehouse(double amount) {
        if (amount > 0) {
            this.balance += amount;
            if (this.balance >= this.capacity) {
                this.balance = this.capacity;
            }
        }
    }

    public double takeFromWarehouse(double amount) {
        if (amount <= 0) {
            return 0;
        }
        if (amount > this.balance) {
            double takeAll = this.balance;
            this.balance = 0;
            return takeAll;
        }
        this.balance -= amount;
        return amount;
    }

    public double getBalance() {
        return balance;
    }

    public double getCapacity(){
        return capacity;
    }

    public double howMuchSpaceLeft() {
        return capacity - balance;
    }

    public String toString() {
        return "balance = " + getBalance() + ", space left " + howMuchSpaceLeft();
    }
}
