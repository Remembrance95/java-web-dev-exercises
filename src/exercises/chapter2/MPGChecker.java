package exercises.chapter2;

import java.util.Scanner;

public class MPGChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles were driven? ");
        int miles = input.nextInt();
        System.out.println("Hom many gallons were consumed? ");
        int gallons = input.nextInt();
        int mpg = miles / gallons;
        System.out.println("You are getting " + mpg + " miles per gallon");
    }
}
