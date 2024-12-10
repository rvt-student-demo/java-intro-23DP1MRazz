package lv.rvt;

import java.io.BufferedReader;
import java.util.ArrayList;

public class Person {
    private String name;
    private int age;
    private String group;
    private double weight;
    private double height;
    private double BMI;

    public Person(String initialName, int initialAge, double initialWeight, double initialHeight) {
        this.age = initialAge;
        this.weight = initialWeight;
        this.height = initialHeight;
        this.name = initialName;
    }

    public Person(String initialName) {
        this.name = initialName;
    }
    
    public String toString() {
        return String.format("| %8s | %3d | %6.1f | %6.1f | %5.2f |", this.name, this.age, this.weight, this.height, bodyMassIndex());
    }

    public String toCsvRow() {
        return String.format("%s, %d, %.2f, %.2f%n", this.name, this.age, this.weight, this.height);
    }

    public double bodyMassIndex() {
        double heigthPerHundred = this.height / 100.0;
        return this.weight / (heigthPerHundred * heigthPerHundred);
    }
    
    public int getAge() {
        return this.age;
    }
    
    public String getName() {
        return this.name;
    }

    public double getWeight() {
        return this.weight;
    }
    
    // public void setAge(int age) {
    //     this.age = age;
    // }
    
    // public void setName(String name) {
    //     this.name = name;;
    // }

    // public double maximumHeartRate() {
    //     return 206.3 - (0.711 * this.age);
    // }
    
    // public void setGroup(String group) {
    //     this.group = group;
    // }

    // public String getGroup() {
    //     return this.group;
    // }

    // public void growOlder() {
    //     if (this.age < 30) {
    //         this.age++;
    //     }
    // }

    // public boolean isOfLegalAge() {
    //     return this.age >= 18;
    // }

    // public void setHeight(int newHeight) {
    //     this.height = newHeight;
    // }
    
    public void setWeight (double newWeight) {
        this.weight = newWeight;
    }

}