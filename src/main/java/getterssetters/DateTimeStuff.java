package getterssetters;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateTimeStuff {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalTime currentTime = LocalTime.now();
        System.out.println("The current time is: " + currentTime);

        System.out.println("Day of Week: " + date.getDayOfWeek());
        System.out.println("Day of Month: " + date.getDayOfMonth());
        System.out.println("Day of Year: " + date.getDayOfYear());
        System.out.println("Month Name: " + date.getMonth());
        System.out.println("Month Value: " + date.getMonthValue());
        System.out.println("Year: " + date.getYear());

    }
}
