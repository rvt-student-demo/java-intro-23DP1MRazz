package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonManager {

    public static ArrayList<Person> getPersonList() throws Exception {
        ArrayList<Person> persons = new ArrayList<>();

        BufferedReader reader = Helper.getReader("person.csv");
        reader.readLine();

        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(", ");

            Person person1 = new Person(parts[0], Integer.valueOf(parts[1]), Double.valueOf(parts[2]), Double.valueOf(parts[3]));
            persons.add(person1);
        }

        return persons;
    }

    public static void addPerson(Person person) throws Exception {
        BufferedWriter writer = Helper.getWriter("person.csv", StandardOpenOption.APPEND);
        writer.write(person.toCsvRow());
        // writer.newLine();
        writer.close();
    }

    public static void main(String[] args) throws Exception {
            
        Scanner scanner = new Scanner(System.in);
        boolean isProgrammRunning = true;
        System.out.println("Welcome to person manager, type \"help\" to see availible commands.");
        
        while (isProgrammRunning) {
            System.out.println();
            System.out.print("Your command: ");
            String command = scanner.nextLine();
            System.out.println();

            if (command.equals("exit")) {
                System.out.println("Thanks, bye bye!");
                isProgrammRunning = false;
            } else if (command.equals("show")){
                ArrayList<Person> persons = PersonManager.getPersonList();

                System.out.println("--------------------------------------------");
                System.out.printf("| %8s | %3s | %6s | %6s | %5s |\n", "Name", "Age", "Weight", "Height", "BMI");
                System.out.println("--------------------------------------------");
                for (Person person : persons) {
                    System.out.println(person);
                }
                System.out.println("--------------------------------------------");
            } else if (command.equals("add")) {
                System.out.println("Enter name:");
                String name = scanner.nextLine();
                System.out.println("Enter age:");
                int age = scanner.nextInt();
                scanner.nextLine(); // Consume the leftover newline
                System.out.println("Enter weight:");
                double weight = scanner.nextDouble();
                scanner.nextLine(); // Consume the leftover newline
                System.out.println("Enter height:");
                double height = scanner.nextDouble();
                scanner.nextLine(); // Consume the leftover newline
            
                Person person = new Person(name, age, weight, height);
                PersonManager.addPerson(person);
            } else if (command.equals("help")) {
                System.out.println("show - show all persons");
                System.out.println("add - add a person");
                System.out.println("exit - exit the programm");
            }

        }
        scanner.close();
    }
}
 