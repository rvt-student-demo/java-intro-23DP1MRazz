package lv.rvt;

import java.util.Scanner;

import javax.swing.plaf.TreeUI;

public class App {
    public static void main( String[] args ) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give numbers:");
        
        int sum = 0;
        int numCount = 0;
        int even = 0;
        int odd = 0;

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == -1) {
                break;
            }

            if (number % 2 == 0) {
                even ++;
            }
            else {
                odd++;
            }

            sum += number;
            numCount ++;
        }

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numCount);
        System.out.println("Average: " + ((double)sum / numCount));
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
