package lv.rvt;

import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> history;
    
    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        history.add(status);
    }

    public void clear() {
        history.clear();
    }

    public String toString() {
        return history.toString();
    }

    public double maxValue() {
        double max = 0;
        for (double elem : history) {
            if (elem > max) {
                max = elem;
            }
        }
        return max;
    }

    public double minValue() {
        double min = 0;
        for (double elem : history) {
            if (elem < min) {
                min = elem;
            }
        }
        return min;
    }

    public double average() {
        if (history.size() > 0) {
            double sum = 0;
            for (double elem : history) {
                sum += elem;
            }
            return sum / history.size();
        }
        return 0;
    }


}
