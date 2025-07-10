package Basic;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    // How to work with Dates & Times using java
    // (LocalDate, LocalTime, LocalDateTime, UTC timestamp)

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        DateTimeFormatter  formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String newDateTime = dateTime.format(formatter);
        System.out.println(newDateTime);

        System.out.println(dateTime);
    }
}
