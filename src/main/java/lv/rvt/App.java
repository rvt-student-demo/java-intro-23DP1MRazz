package lv.rvt;

import java.util.Scanner;

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
        */

        /*
        // Reading input
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input);
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadi savu vardu: ");
        String name = scanner.nextLine();

        System.out.println("Ievadi savu uzvardu: ");
        String surname = scanner.nextLine();

        System.out.println("Ievadi savu grupu: ");
        String group = scanner.nextLine();

        System.out.println("Students: " + name + " " + surname + ", grupa: " + group);

    }
}
