package main11;

import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //String email = "Caio1234567@gmail.com";
        String email;
        String username;
        String domain;

        // Ask the Email
        System.out.print("Enter you email: ");
        email = scanner.nextLine();

        // Check
        if (email.contains("@")) {
            // Set the Username and Domain
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);

            System.out.println(username);
            System.out.println(domain);
        } else {
            System.out.println("Emails must contain @");
        }



        scanner.close();
    }
}
