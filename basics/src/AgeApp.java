import java.util.Scanner;

public class AgeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Condition s: If  age is equal to 18, print "You can drive a car".
        if (age == 18) {
            System.out.println("You can drive a car.");
        }
           // hello world
        // Condition b: If the age is 10,20,30,40,50,60,70,80,90,100,110, or 120, print "Anniversary Party!!"
        if (age == 10 || age == 20 || age == 30 || age == 40 || age == 50 || age == 60 || age == 70 || 
            age == 80 || age == 90 || age == 100 || age == 110 || age == 120) {
            System.out.println("Anniversary Party!!");
        }

        // Condition c: If the age is 100, print three-line congratulations.
        if (age == 100) {
            System.out.println("Congratulations!");
            System.out.println("That's a century of life!");
            System.out.println("What an amazing milestone!");
        }

        // Condition d: If the age is between 40-50, wish happy mid-life.
        if (age >= 40 && age <= 50) {
            System.out.println("Happy mid-life!");
        }

        scanner.close();

    }
}
