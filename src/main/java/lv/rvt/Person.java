package lv.rvt;

import java.io.BufferedReader;
import java.util.ArrayList;

public class Person {
    private String name;
    private int age;
    private String group;
    private int weight;
    private int height;

    public Person(String initialName, int initialAge, int initialWeight, int initialHeight) {
        this.age = initialAge;
        this.weight = initialWeight;
        this.height = initialHeight;
        this.name = initialName;
    }

    public Person(String initialName) {
        this.name = initialName;
    }
    
    public String toString() {
        return this.name + ", BMI: " + this.bodyMassIndex()
            + ", maximum heart rate: " + this.maximumHeartRate();
    }

    public double maximumHeartRate() {
        return 206.3 - (0.711 * this.age);
    }

    // public void printPerson() {
    //     System.out.println(this.name + ", age " + this.age + " years");
    // }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;;
    }

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
    
    // public void setWeight (int newWeight) {
    //     this.weight = newWeight;
    // }

    public double bodyMassIndex() {
        double heigthPerHundred = this.height / 100.0;
        return this.weight / (heigthPerHundred * heigthPerHundred);
    }

    // public static void main( String[] args ) {

    //     Person ada = new Person("Ada");
    //     Person max = new Person("Max");

    //     max.printPerson();
    //     ada.printPerson();
    //     System.out.println("");

    //     max.growOlder();
    //     for (int i = 0; i < 35; i++) {
    //         ada.growOlder();
    //     }
    //     max.printPerson();
    //     ada.printPerson();
    //     System.out.println("");

    //     System.out.println(max.isOfLegalAge());
    //     if (ada.isOfLegalAge()) {
    //         System.out.println("Ada is 18 or older");
    //     }
    //     System.out.println("");

    //     max.setAge(100);
    //     System.out.println(max.getAge());
    //     System.out.println("");

    //     ada.setGroup("dp2-1");
    //     System.out.println(ada.getGroup());
    //     System.out.println("");

    //     max.setHeight(173);
    //     max.setWeight(69);
    //     System.out.println(max.bodyMassIndex());
    //     System.out.println("");
        
    //     System.out.println(max);
    // }

        public static void main(String[] args) throws Exception {

        ArrayList<Person> persons = new ArrayList<>();

        BufferedReader reader = Helper.getReader("persons.csv");
        String line;
        
        reader.readLine();
        int ageSum = 0;
        while((line = reader.readLine()) != null) {
            String[] parts = line.split(", ");
            
            String name = parts[0];
            int age = Integer.valueOf(parts[1]);
            int weight = Integer.valueOf(parts[2]);
            int height = Integer.valueOf(parts[3]);
            
            ageSum += age;
            
            Person prsn = new Person(name, age, weight, height);
            persons.add(prsn);
        }
        reader.close();
        
        for (Person person : persons) {
            System.out.println(person);
        }

        System.out.println("Average age: " + ageSum / persons.size());
    }
}