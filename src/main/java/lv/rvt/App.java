package lv.rvt;

import java.util.*;

public class App {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> listName = new ArrayList<>();
        ArrayList<Integer> listAge = new ArrayList<>();

        while (true) {
            String info = scanner.nextLine();
            if (info.equals("")) {
                break;
            } else {
                listName.add(info.split(",")[0]);
                listAge.add(Integer.valueOf(info.split(",")[1]));
            }
        }
        scanner.close();

        int sum = 0;
        String longestName = "";
        for (int i = 0; i < listName.size(); i++) {
            sum += listAge.get(i);
            if (listName.get(i).length() > longestName.length()) {
                longestName = listName.get(i);
            }
        }
        
        double avg = (double) sum / listAge.size();

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + avg);
    }
}