package lv.rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            int num = scanner.nextInt();
            if (num == -1) {
                break;
            } else {
                numbers.add(num);
            }
        }
        System.out.println("From where? ");
        int start = scanner.nextInt();

        System.out.println("To where? ");
        int stop = scanner.nextInt();
        while (true) {

            if (start < 0 || stop > (numbers.size() - 1)) {
                System.out.println("Incorrect index!");

                System.out.println("From where? ");
                start = scanner.nextInt();
                System.out.println("To where? ");
                stop = scanner.nextInt();
            }
            break;
        }

        for (int i = start; i < (stop + 1); i++) {
            System.out.println(numbers.get(i));
        }
    }
}