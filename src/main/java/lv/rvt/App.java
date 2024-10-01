package lv.rvt;

import java.util.Scanner;

import javax.swing.plaf.TreeUI;

public class App {
    public static void main( String[] args ) {
        
        devisibleByThreeInRange(2, 10);

    }

    public static void devisibleByThreeInRange(int first, int second) {
        for (int i = first; i < (second + 1); i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
