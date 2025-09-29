package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your name: ");

        System.out.print("First Name: ");
        String firstName = scan.nextLine().trim();

        System.out.print("Middle Name: ");
        String middleName = scan.nextLine().trim();

        System.out.print("Last Name: ");
        String lastName = scan.nextLine().trim();

        System.out.print("Suffix: ");
        String suffix = scan.nextLine().trim();

        if (firstName.isEmpty() || lastName.isEmpty()) {
            System.out.println("Did not enter a first or last name.");
            return;
        }

        String shortenedMiddle = "";
        if (!middleName.isEmpty()) {
            shortenedMiddle = middleName.charAt(0) + ".";
        }

        String finalName;
        if (suffix.isEmpty()) {
            finalName = firstName + " " + shortenedMiddle + " " + lastName;
        } else {
            finalName = firstName + " " + shortenedMiddle+" " + lastName + ", " + suffix;
        }

        System.out.println("Full name: " + finalName);
    }
}
