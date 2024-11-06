package lv.rvt;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Statistics statistics = new Statistics();
        Scanner scanner = new Scanner(System.in);

        // System.out.println("\nPart 1\n");
        // statistics.addNumber(3);
        // statistics.addNumber(5);
        // statistics.addNumber(1);
        // statistics.addNumber(2);
        // System.out.println("Count: " + statistics.getCount());

        // System.out.println("\nPart 2\n");
        // System.out.println("Sum: " + statistics.sum());
        // System.out.println("Average: " + statistics.average());

        // System.out.println("\nPart 3\n");
        // System.out.println("Enter numbers:");
        // int input = scanner.nextInt();
        // while (input != -1) {
        //     statistics.addNumber(input);
        //     input = scanner.nextInt();
        // }
        // System.out.println("Sum: " + statistics.sum());

        System.out.println("\nPart 4\n");
        Statistics even = new Statistics();
        Statistics odd = new Statistics();
        System.out.println("Enter numbers:");
        int input = scanner.nextInt();
        while (input != -1) {
            statistics.addNumber(input);
            if (input % 2 == 0) {
                even.addNumber(input);
            }
            if (input % 2 == 1) {
                odd.addNumber(input);
            }
            input = scanner.nextInt();
        }
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + even.sum());
        System.out.println("Sum of odd numbers: " + odd.sum());

        scanner.close();
    }
}