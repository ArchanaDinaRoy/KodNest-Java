package track.ArrayProject;

import java.util.Scanner;

public class TwoDArray2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] a = new int[3][];

        a[0] = new int[4];
        a[1] = new int[3];
        a[2] = new int[5];

        System.out.println("Enter Array Elements:");

        // Taking input
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = scan.nextInt();
            }
        }

        System.out.println("Array Elements are:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        scan.close();
    }

}
