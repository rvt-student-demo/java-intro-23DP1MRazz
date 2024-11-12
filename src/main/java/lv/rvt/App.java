package lv.rvt;

import java.io.BufferedReader;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Person> persons = new ArrayList<>();

        BufferedReader reader = Utils.getReader("persons.csv");
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

        System.out.println(ageSum / persons.size());
    }
}