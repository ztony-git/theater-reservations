package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        System.out.println("Please enter your full name: ");
        String name = scanner.nextLine();
        String firstName = name.substring(0, name.indexOf(" "));
        String lastName = name.substring(name.indexOf(" ") + 1);

        System.out.println("What date will you be coming (MM/dd/yyyy): ");
        LocalDate date = LocalDate.parse(scanner.nextLine(), format);

        System.out.println("How many tickets would you like?: ");
        int tickets = scanner.nextInt();

        System.out.println((tickets == 1 ? tickets + " ticket " : tickets + " tickets ") +
                "reserved for " + date + " under " + lastName + ", " + firstName);
    }
}
