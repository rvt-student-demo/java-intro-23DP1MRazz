package lv.rvt;

import java.util.*;

public class App {
    public static void main(String[] args) {
        // System.out.println("\nPart 1,2\n");
        // PaymentCard card = new PaymentCard(50);
        // System.out.println(card);
        // card.eatAffordably();
        // System.out.println(card);
        // card.eatHeartily();
        // card.eatAffordably();
        // // System.out.println(card);

        // System.out.println("\nPart 3\n");
        // PaymentCard card = new PaymentCard(5);
        // System.out.println(card);
        // card.eatHeartily();
        // System.out.println(card);
        // card.eatHeartily();
        // System.out.println(card);

        // System.out.println("\nPart 4\n");
        // PaymentCard card = new PaymentCard(10);
        // System.out.println(card);
        // card.addMoney(15);
        // System.out.println(card);
        // card.addMoney(10);
        // System.out.println(card);
        // card.addMoney(200);
        // System.out.println(card);

        // System.out.println("\nPart 5\n");
        // PaymentCard card = new PaymentCard(10);
        // System.out.println("Paul: " + card);
        // card.addMoney(-15);
        // System.out.println("Paul: " + card);

        System.out.println("\nPart 6\n");
        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);
        paulsCard.eatHeartily();
        mattsCard.eatAffordably();
        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);
        paulsCard.addMoney(20);
        mattsCard.eatHeartily();
        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);
        paulsCard.eatAffordably();
        paulsCard.eatAffordably();
        mattsCard.addMoney(50);
        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);
    }
}