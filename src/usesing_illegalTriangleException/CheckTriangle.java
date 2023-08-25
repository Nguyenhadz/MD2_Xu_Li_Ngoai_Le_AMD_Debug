package usesing_illegalTriangleException;

import java.util.Scanner;

public class CheckTriangle {

    static public class IllegaTriangleException extends Exception {
        public IllegaTriangleException(String message) {
            super(message);
        }
    }
    static void check(int a, int b, int c) throws IllegaTriangleException {
        if ( a < 0 || b < 0 || c <0) {
            throw new IllegaTriangleException("Các cạnh phải là số dương");
        } else if ( a+b<c || a+c<b || c+b<a) {
            throw new IllegaTriangleException("Không phải 3 cạnh tam giác");
        } else {
            throw new IllegaTriangleException("Là 3 cạnh tam giác");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 sides of triangle:");
        System.out.println("Sides 1:");
        int a = scanner.nextInt();
        System.out.println("Sides 2:");
        int b = scanner.nextInt();
        System.out.println("Sides 3:");
        int c = scanner.nextInt();
        try {
            check(a, b, c);
        } catch (IllegaTriangleException e) {
            System.out.println(e);
        }
    }
}
