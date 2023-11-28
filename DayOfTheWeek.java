package individual_assignments;
import java.util.Arrays;
import java.util.Scanner;

/*
Make an array that holds values of the days of the week and then have the user input
a number corresponding to day of the week.
Output string that represents the day of the week that corresponds to the number
the user input.
 */
public class DayOfTheWeek {
    // array that holds the textual values of the days
    private static String[] days = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter a number: ");
        int day = scanner.nextInt();
        String dayAsString = convertDays(day);
        convertDays(day);
        System.out.println("The corresponding day is " + dayAsString);
    }

    public static String convertDays(int day) {

        for (int i = 0; i < days.length; i++) {
            if (i + 1 == day) {
                return days[i];
            }

        }
        return "Invalid day number";
    }
}


