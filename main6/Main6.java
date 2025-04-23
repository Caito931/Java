package main6;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* 
        System.out.println(Math.PI);
        System.out.println(Math.E);

        double result;

        result = Math.pow(2, 5);
        result = Math.abs(-5);
        result = Math.sqrt(9);
        result = Math.round(3.14);
        result = Math.ceil(3.14);
        result = Math.floor(3.99);
        result = Math.max(10, 20);
        result = Math.min(10, 20);

        System.out.println(result);

        // HYPOTENUSE c = Math.sqrt(a*a, b*b)

        double a;
        double b;
        double c;

        System.out.print("Enter the lenght of the side A: ");
        a = scanner.nextDouble();

        System.out.print("Enter the lenght of side B: ");
        b = scanner.nextDouble();

        //c = Math.sqrt(a*a + b*b);
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("The Hypotenuse (side c) is: " + c);
        */

        // circumference = 2 * Math.PI * radius
        // area = Math.PI * Math.pow(radius, 2)
        // voluime = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3)

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the Radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        /* 
        System.out.println("The circumference is: " + circumference + " cm");
        System.out.println("The area is: " + area + "cm²");
        System.out.println("The volume is: " + volume + "cm³");
        */

        System.out.printf("The circumference is: %.2f cm\n", circumference );
        System.out.printf("The area is: %.2f cm²\n", area );
        System.out.printf("The volume is: %.2f cm³\n" , volume) ;


        scanner.close();
    }
}
