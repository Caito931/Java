package main9;

public class Main9 {
    public static void main(String[] args) {
        boolean isStudent = true;
        boolean isSenior = true;
        double price = 9.99;

        if(isStudent) {
            if (isSenior) {
                System.out.println("You get a senior discount of 20%");
                System.out.println("You get a student discount of 10%");
                // price *= 0.7
                price = price - (30 * (price/100));
            } else {
                System.out.println("You get a student discount of 10%");
                // price *= 0.9;
                price = price - (10 * (price/100));
            }
        }
        else {
            if (isSenior) {
                System.out.println("You get a senior discount of 20%");
                price = price - (20 * (price/100));
            } else {
                price *= 1;
            }   
        }

        System.out.printf("The price of a ticket is: $%.2f\n", price);
    }
}
