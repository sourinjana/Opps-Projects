import java.util.Scanner;

public class CoffeeMachineApp {
    public static void main(String[] args) {

        CoffeeMachine coffeeMachine = new CoffeeMachine();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Menu");
            System.out.println("2. Buy coffee");
            System.out.println("3. Fill ingredients");
            System.out.println("4. Take money");
            System.out.println("5. Show ingredients");
            System.out.println("6. Analytics");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    coffeeMachine.showDetails();
                    break;
                case 2:
                    System.out.print("Enter coffee type (espresso/latte/cappuccino): ");
                    String coffeeType = scanner.nextLine().toLowerCase();
                    coffeeMachine.buyCoffee(coffeeType);
                    break;
                case 3:
                    System.out.print("Enter amount of water to add (ml): ");
                    int waterToAdd = scanner.nextInt();
                    System.out.print("Enter amount of milk to add (ml): ");
                    int milkToAdd = scanner.nextInt();
                    System.out.print("Enter amount of beans to add (grams): ");
                    int beansToAdd = scanner.nextInt();
                    coffeeMachine.fillIngredients(waterToAdd, milkToAdd, beansToAdd);
                    break;
                case 4:
                    coffeeMachine.takeMoney();
                    break;
                case 5:
                    coffeeMachine.showIngredients();
                    break;
                case 6:
                    coffeeMachine.showAnalytics();
                    break;
                case 7:
                    System.out.println("Exiting Coffee Machine Simulator.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        
    }
    
}