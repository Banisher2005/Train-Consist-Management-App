import java.util.ArrayList;

public class UC2 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App : UC2 ===");

        // Create dynamic list for passenger bogies
        ArrayList<String> passengerBogies = new ArrayList<>();

        // Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display after insertion
        System.out.println("Passenger bogies after insertion:");
        System.out.println(passengerBogies);

        // Remove one bogie
        passengerBogies.remove("AC Chair");
        System.out.println("After removing AC Chair:");
        System.out.println(passengerBogies);

        // Check existence
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie exists in the consist.");
        } else {
            System.out.println("Sleeper bogie not found.");
        }

        // Final list state
        System.out.println("Final bogie list:");
        System.out.println(passengerBogies);
    }
}