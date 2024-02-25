package Application;

import Data.DataUser;
import Handler.HandlerUser;
import Output.Outputer;

import java.util.Scanner;

public class App {

    private static Outputer outputer = new Outputer();
    private static DataUser dataUser = new DataUser();
    private static HandlerUser handlerUser = new HandlerUser();
    private static Scanner sc = new Scanner(System.in);
    private static boolean continueWorking = true;

    public static void appStart() {
        while (continueWorking) {
            System.out.println("_____________________");
            displayMenu();
            try {
                int option = Integer.parseInt(sc.nextLine());
                switch (option) {
                    case 1 -> outputer.getOutput(handlerUser.handleAllUser(dataUser.getUser()));
                    case 2 -> outputer.getOutput(handlerUser.handleUserFilterWith(dataUser.getUser()));
                    case 3 -> outputer.getOutput(handlerUser.handleUserFilterWithout(dataUser.getUser()));
                    case 4 -> {
                        System.out.println("Have a good day!");
                        continueWorking = false;
                    }
                    default -> System.out.println("Enter correct number");
                }
            } catch (NumberFormatException e) {
                System.out.println("Exception " + e.getMessage());
            }
        }
        sc.close();
    }

    private static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Get all user");
        System.out.println("2. Get user with \"123\" in email");
        System.out.println("3. Get user without \"123\" in email");
        System.out.println("4. Exit");
        System.out.print("Enter number: ");
    }
}
