package exercises.chapter2;

import java.util.Scanner;

public class AreaOfARectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of the rectangle? ");
        double length = input.nextDouble();
        System.out.println("What is the width of the rectangle? ");
        double width = input.nextDouble();
        double area = length * width;
        System.out.println("The rectangle has area of " + area);
    }
}
