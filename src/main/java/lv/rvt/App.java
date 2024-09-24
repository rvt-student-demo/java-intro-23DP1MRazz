package lv.rvt;

import java.util.Scanner;

import javax.swing.plaf.TreeUI;

public class App
{
    public static void main( String[] args )
    {
        /* 
        //Once Upon a Time
        System.out.println("Once upon a time");
        System.out.println("there was");
        System.out.println("a program");


        // variables
        String text = "contains text";
        int wholeNumber = 21;
        double floatingPoint = 123.123;
        boolean trueOrFalse = true;

        System.out.println("text variable: " + text);
        System.out.println("integer variable: " + wholeNumber);
        System.out.println("floating-point variable: " + floatingPoint);
        System.out.println("Boolean: " + trueOrFalse);

        // Changing a Value Assigned to a Variable
        int value = 10;
        System.out.println(value);
        value = 4;
        System.out.println(value);
        
        // Variable's Type Persists
        boolean assignment = false;
        assignment = 42; // will not work
        assignment = value; //will not work
        
        double floatingPoint2 = 0.42;
        floatingPoint2 = 1; // Works
        floatingPoint2 = value; // Also works
        

        // Reading input
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input);

        //Uzdevums 0
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ievadi savu vardu: ");
        String name = scanner.nextLine();
        
        System.out.println("Ievadi savu uzvardu: ");
        String surname = scanner.nextLine();
        
        System.out.println("Ievadi savu grupu: ");
        String group = scanner.nextLine();
        
        System.out.println("Students: " + name + " " + surname + ", grupa: " + group);
        
        Scanner scanner = new Scanner(System.in);
        //Ievadam String un parkonvertejam to par Int citaja mainigaja
        String input = scanner.nextLine();
        int inputAsInt = Integer.valueOf(input);
        
        System.out.println("Rezultats: " + inputAsInt * 10);
        
        Scanner scanner = new Scanner(System.in);
        
        int skaitlis = Integer.valueOf(scanner.nextLine());
        double decimalSkaitlis = Double.valueOf(scanner.nextLine());
        boolean bool = Boolean.valueOf(scanner.nextLine());
        
        System.out.println("summa" + 1 + 2);
        System.out.println("summa" + (1+2));
        
        Scanner scanner = new Scanner(System.in);
        
        int number1 = Integer.valueOf(scanner.nextLine());
        int number2 = Integer.valueOf(scanner.nextLine());
        int number3 = Integer.valueOf(scanner.nextLine());
        
        int sum = number1 + number2 + number3;
        int mult = number1 * number2 * number3;
        
        System.out.println("Summa = " + sum);
        System.out.println("Reizinājums = " + mult);
        System.out.println("Vidējais = " + sum / 3.0);
        

        int calculationWithParentheses = (1 + 1) + 3 * (2 + 5);
        System.out.println(calculationWithParentheses);
        
        int calculationWithoutParentheses = 1 + 1 + 3 * 2 +5;
        System.out.println(calculationWithoutParentheses);
        
        int first = 2;
        int second = 3;
        
        double result = (double) first / second;
        System.out.println(result);
        
        
        //Conditional statements and conditional operation
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give speed: ");
        int speed = Integer.valueOf(scanner.nextLine());
        
        if (speed > 120) {
            System.out.println("Speeding ticket!");
        }
        
        
        System.out.println("Give the first number:");
        int num1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int num2 = Integer.valueOf(scanner.nextLine());
        
        if (num1 > num2) {
            System.out.println("Greater number is: " + num1);
        } else if (num2 > num1) {
            System.out.println("Greater number is: " + num2);
        } else {
            System.out.println("The numbers are equal!");
        }
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Value of the gift?");
        int value = Integer.valueOf(scanner.nextLine());
        
        double tax = 0;
        if (value >= 1000000) {
            tax = (142100 + (value - 1000000) * 0.17);
        } else if (value >= 200000) {
            tax = (22100 + (value - 200000) * 0.15);
        } else if (value >= 55000) {
            tax = (4700 + (value - 55000) * 0.12);
        } else if (value >= 25000) {
            tax = (1700 + (value - 25000) * 0.10);
        } else if (value >= 5000) {
            tax = (100 + (value - 5000) * 0.08);
        }
        
        if (tax == 0) {
            System.out.println("No tax!");
        } else {
            System.out.println("Tax: " + tax);
        }
        
        Scanner scanner = new Scanner(System.in);
        
        int number = 0;
        int numberSum = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == 0) {
                break;
            }
            
            numberSum += input;
            number++;
        }
        System.out.println("Number of numbers: " + number);
        System.out.println("Sum of the numbers: " + numberSum);
        */

        Scanner scanner = new Scanner(System.in);

        int start = Integer.valueOf(scanner.nextLine());

        for (int i = start; i < 101; i++) {
            System.out.println(i);
        }


    }
}
