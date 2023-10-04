public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app.
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        // Menu variables
        double mochaPrice = 3.5;
        double dripCoffeePrice = 2.0; // Added drip coffee price
        double lattePrice = 4.0; // Added latte price
        double cappuccinoPrice = 4.5; // Added cappuccino price

        // Customer name variables
        String customer1 = "Cindhuri";
        String customer2 = "Noah"; // Added Noah
        String customer3 = "Sam"; // Added Sam
        String customer4 = "Jimmy"; // Added Jimmy

        // Order completions
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true; // Added isReadyOrder2
        boolean isReadyOrder3 = true; // Added isReadyOrder3
        boolean isReadyOrder4 = false; // Added isReadyOrder4

        // APP INTERACTION SIMULATION
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"

        // Cindhuri's order
        if (isReadyOrder1) {
            System.out.println(customer1 + readyMessage);
            System.out.println(displayTotalMessage + mochaPrice);
        } else {
            System.out.println(customer1 + pendingMessage);
        }

        // Noah's order
        if (isReadyOrder2) {
            System.out.println(customer2 + readyMessage);
            System.out.println(displayTotalMessage + cappuccinoPrice);
        } else {
            System.out.println(customer2 + pendingMessage);
        }

        // Sam's order
        double latteTotal = lattePrice * 2; // Total for 2 lattes
        System.out.println(displayTotalMessage + latteTotal);
        if (isReadyOrder3) {
            System.out.println(customer3 + readyMessage);
        } else {
            System.out.println(customer3 + pendingMessage);
        }

        // Jimmy's order (incorrect charge)
        double coffeePrice = 2.5; // Corrected price for coffee
        double jimmyTotal = coffeePrice; // Jimmy was charged for a coffee
        System.out.println(displayTotalMessage + jimmyTotal);

        // Change prices and statuses to test
        mochaPrice = 4.0; // Updated mocha price
        isReadyOrder4 = true; // Updated Jimmy's order status
        System.out.println("Updated prices and statuses:");
        System.out.println(displayTotalMessage + mochaPrice); // Display updated mocha price
        if (isReadyOrder4) {
            System.out.println(customer4 + readyMessage);
        } else {
            System.out.println(customer4 + pendingMessage);
        }
    }
}
