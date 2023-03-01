package My_Practice;
import java.util.Scanner;

public class AdventureGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String playerName;
        String playerChoice;

        System.out.println("Welcome to the Adventure Game!");
        System.out.print("What is your name? ");
        playerName = sc.nextLine();

        System.out.println("Hello, " + playerName + "! You are about to embark on a great adventure.");
        System.out.println("You find yourself standing in front of a dark forest.");
        System.out.println("What would you like to do?");
        System.out.println("1. Enter the forest");
        System.out.println("2. Turn back and go home");

        playerChoice = sc.nextLine();
        if (playerChoice.equals("1")) {
            System.out.println("You enter the forest and start walking.");
            System.out.println("After a few minutes, you come across a fork in the path.");
            System.out.println("Which way would you like to go?");
            System.out.println("1. Left");
            System.out.println("2. Right");

            playerChoice = sc.nextLine();
            if (playerChoice.equals("1")) {
                System.out.println("You turn left and come across a river.");
                System.out.println("What would you like to do?");
                System.out.println("1. Attempt to cross the river");
                System.out.println("2. Follow the river downstream");

                playerChoice = sc.nextLine();
                if (playerChoice.equals("1")) {
                    System.out.println("You attempt to cross the river, but the current is too strong and you are swept away.");
                    System.out.println("Game over.");
                } else if (playerChoice.equals("2")) {
                    System.out.println("You follow the river downstream and eventually come across a small village.");
                    System.out.println("Congratulations, you have completed the adventure!");
                } else {
                    System.out.println("Invalid choice. Game over.");
                }
            } else if (playerChoice.equals("2")) {
                System.out.println("You turn right and come across a clearing.");
                System.out.println("In the center of the clearing, you see a treasure chest.");
                System.out.println("What would you like to do?");
                System.out.println("1. Open the chest");
                System.out.println("2. Leave the clearing");

                playerChoice = sc.nextLine();
                if (playerChoice.equals("1")) {
                    System.out.println("You open the chest and find it full of treasure!");
                    System.out.println("Congratulations, you have completed the adventure!");
                } else if (playerChoice.equals("2")) {
                    System.out.println("You leave the clearing and continue on your adventure.");
                    System.out.println("After a few more hours of walking, you come across a small village.");
                    System.out.println("Congratulations, you have completed the adventure!");
                } else {
                    System.out.println("Invalid choice. Game over.");
                }
            } else {
                System.out.println("Invalid choice. Game over.");
            }
        } else if (playerChoice.equals("2")) {
            System.out.println("You turn back and go home.");
            System.out.println("Thanks for playing!");
        } else {
            System.out.println("Invalid choice. Game over.");
        }
    }
}
