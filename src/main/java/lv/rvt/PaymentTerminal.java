package lv.rvt;
public class PaymentTerminal {
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        if (payment >= 2.5) {
            this.money += 2.5;
            this.affordableMeals++;
            return payment - 2.5;
        }
        return payment;
    }

    public double eatHeartily(double payment) {
        if (payment >= 4.3) {
            this.money += 4.3;
            this.heartyMeals++;
            return payment - 4.3;
        }
        return payment;
    }

    public boolean eatAffordably(PaymentCard card) {
        if (card.takeMoney(2.5)) {
            affordableMeals++;
            return true;
        }
        return false;
    }

    public boolean eatHeartily(PaymentCard card) {
        if (card.takeMoney(4.3)) {
            heartyMeals++;
            return true;
        }
        return false;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        card.addMoney(sum);
        this.money += sum;
    }

    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }

}
