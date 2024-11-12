package lv.rvt;

import java.io.BufferedReader;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = Utils.getReader("data.csv");

        String line;
        line = reader.readLine();

        while((line = reader.readLine()) != null) {
            String[] parts = line.split(", ");
            String id = parts[0];
            String name = parts[1];
            String psswrd = parts[2];
            
            System.out.println("ID: " + id + "; Name: "+ name + "; Passwords: " + psswrd);
        }

    }
}