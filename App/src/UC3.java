import java.util.ArrayList;

public class UC2 {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App : UC2 ===");

        // Dynamic passenger bogie list
        ArrayList<String> passengerBogies = new ArrayList<>();

        // Insert bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display after insertion
        System.out.println("Passenger bogies after adding:");
        System.out.println(passengerBogies);

        // Remove a bogie
        passengerBogies.remove("AC Chair");

        // Display after removal
        System.out.println("After removing AC Chair:");
        System.out.println(passengerBogies);

        // Check if Sleeper exists
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie is present.");
        } else {
            System.out.println("Sleeper bogie is not present.");
        }

        // Final list state
        System.out.println("Final passenger bogie list:");
        System.out.println(passengerBogies);
    }
}