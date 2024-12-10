package lv.rvt;

public class HealthStation {
    private int weighCount;

    public double weigh(Person person) {
        weighCount++;
        return person.getWeight();
    }

    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }

    public int weighings() {
        return weighCount;
    }
}
