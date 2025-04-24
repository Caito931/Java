package main7;

public class Main7 {
    public static void main(String[] args) {
        String name = "SpongeBob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;  
        boolean isEmployed = true;

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with a %c\n", firstLetter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You are %f inches tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);

        System.out.printf("%s if %d years old\n", name, age);

        // + = output a plus
        // , = comma grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, plus if positive

        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54.01;

        System.out.printf("% .2f \n", price1);
        System.out.printf("% .2f \n", price2);
        System.out.printf("% .2f \n", price3);
    }
}