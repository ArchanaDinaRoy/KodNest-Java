package track.ArrayProject;

import java.util.Scanner;

public class TwoDArray1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] a = new int[3][5];

        System.out.println("Enter Array Elements:");

        // Taking input
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        // Displaying array
        System.out.println("Array Elements are:");

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}