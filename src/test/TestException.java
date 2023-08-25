package test;

import java.util.Scanner;

public class TestException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numerator:");
        int numerator = Integer.parseInt(scanner.nextLine());
        System.out.println("Denominator:");
        int denominator = Integer.parseInt(scanner.nextLine());
        int result = numerator/denominator;
        System.out.printf("\nResult: %d / %d \n", numerator, denominator, result);
    }
}
