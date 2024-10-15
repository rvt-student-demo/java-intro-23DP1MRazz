package lv.rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> intList = new ArrayList<>();

        int sum = 0;
        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            else {
                intList.add(num);
                sum += num;
            }
        }
        System.out.println(sum);
    }
}