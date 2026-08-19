package track.ArrayProject;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] a = new int[5];

        System.out.println("Enter Array Elements:");

        // Taking input
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        // Displaying array elements
        System.out.println("Array Elements are:");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();

        // Calculating sum
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }

        System.out.println("Total: " + sum);

        scanner.close();
    }
}