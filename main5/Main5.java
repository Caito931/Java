package main5;

import java.util.Random;

public class Main5 {
    public static void main(String[] args) {
        Random random = new Random();

        int number1;
        double number2;
        boolean isHeads;

        number1 = random.nextInt(1, 101);
        number2 = random.nextDouble();
        isHeads = random.nextBoolean();

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(isHeads);

        if (isHeads) {
            System.out.println("Heads");
        } else {
            System.out.println("Tails");
        }
    }
}
