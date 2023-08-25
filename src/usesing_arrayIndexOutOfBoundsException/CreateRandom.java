package usesing_arrayIndexOutOfBoundsException;

import java.util.Random;
import java.util.Scanner;

public class CreateRandom {
    public Integer[] createRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("List element of Array:");
        for ( int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        CreateRandom createRandom = new CreateRandom();
        Integer[] arr = createRandom.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nInput random index:");
        int index = scanner.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số " + index + " là " + arr[index]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("The network's limit surpassing index");
        }
    }
}
