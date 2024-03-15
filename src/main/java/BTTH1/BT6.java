package BTTH1;

import java.util.Calendar;
import java.util.Scanner;

public class BT6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Enter dates a and b
        System.out.println("Enter date a (in the format dd/MM/yyyy): ");
        Calendar a = Calendar.getInstance();
        a.setLenient(false);
        String[] aDate = scanner.nextLine().split("/");
        a.set(Integer.parseInt(aDate[2]), Integer.parseInt(aDate[1]) - 1, Integer.parseInt(aDate[0]));

        System.out.println("Enter date b (in the format dd/MM/yyyy): ");
        Calendar b = Calendar.getInstance();
        b.setLenient(false);
        String[] bDate = scanner.nextLine().split("/");
        b.set(Integer.parseInt(bDate[2]), Integer.parseInt(bDate[1]) - 1, Integer.parseInt(bDate[0]));

        // 1. Compare dates a and b
        int compareResult = a.compareTo(b);
        if (compareResult < 0) {
            System.out.println("Date a is before date b.");
        } else if (compareResult > 0) {
            System.out.println("Date a is after date b.");
        } else {
            System.out.println("Date a and date b are equal.");
        }

        // 2. Print the previous and next days of date a
        a.add(Calendar.DAY_OF_YEAR, -1);
        System.out.println("Previous day of date a: " + a.getTime());
        a.add(Calendar.DAY_OF_YEAR, 2);
        System.out.println("Next day of date a: " + a.getTime());

        // 3. Determine which day of the week date a is
        int dayOfWeek = a.get(Calendar.DAY_OF_WEEK);
        System.out.println("Date a is on " + dayOfWeek + "th day of the week.");

        // 4. Determine how many days are in the month containing date a
        int daysInMonth = a.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("The month containing date a has " + daysInMonth + " days.");

        // 5. Determine if the year containing date a is a leap year
        int year = a.get(Calendar.YEAR);
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("The year containing date a is a leap year.");
        } else {
            System.out.println("The year containing date a is not a leap year.");
        }
        
        scanner.close();
    }
}
