package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);



        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter age:");
        int age = scanner.nextInt();
        System.out.println("Enter weight:");
        double weight = scanner.nextDouble();
        System.out.println("Enter height:");
        double height = scanner.nextDouble();

        Person person = new Person(name, age, weight, height);
        PersonManager.addPerson(person);
    }
}