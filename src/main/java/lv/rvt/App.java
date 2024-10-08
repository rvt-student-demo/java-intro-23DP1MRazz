package lv.rvt;

import java.util.Scanner;

import javax.swing.plaf.TreeUI;

public class App {
    public static void main( String[] args ) {
        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println();

        printSquare(4);
        System.out.println();

        printRectangle(17, 3);
        System.out.println();

        printTriangle(4);
        System.out.println();

        printRightTriangle(4);
        System.out.println();

        christmasTree(10);
    }

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            printStars(size);
        }
    }

    public static  void printRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            printStars(width);
        }
    }

    public static void printTriangle(int size) {
        for (int i = 0; i < size; i++) {
            printStars(i+1);
        }
    }

    public static void printSpaces(int number) {
        for (int i = number - 1; i > 0; i--) {
            System.out.print(" ");
        }
    }

    public static void printRightTriangle(int size) {
        for (int i = 0; i < size; i++) {
            printSpaces(size - i);
            printStars(i + 1);
        }
    }

    public static void christmasTree(int height) {
        for (int i = 0; i < height; i++) {
            printSpaces(height - i);
            printStars((i + 1) + i);
        }
        for (int a = 0; a < 2; a++) {
            printSpaces(height - 1);
            printStars(3);
        }
    }
}