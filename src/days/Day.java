package days;

/**
 * Defines the days of the week as constants, replacing the brittle String/switch logic.
 */
public enum Day {
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");

    private final String dayName;

    // Constructor
    Day(String dayName) {
        this.dayName = dayName;
    }

    // Public method to get the descriptive name
    public String getDayName() {
        return dayName;
    }
}