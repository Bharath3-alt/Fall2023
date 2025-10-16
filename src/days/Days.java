package days;

// import java.util.Scanner; // No longer needed

/**
 * This class now prints all day names using the Day enum.
 */
public class Days {

    public static void main(String[] args) {
        
        System.out.println("--- All Week Day Names ---");
        
        // Loop through all constant values in the Day enum (Day.values())
        for (Day day : Day.values()) {
            // Print the human-readable name using the getter method
            System.out.println(day.getDayName());
        }
    }
}