package track;

import java.util.Scanner;

public class control_const {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");

        int num = sc.nextInt();

        if (num > 50)

        {

            System.out.println("num is greater");

        }

        else

        {

            System.out.println("num is not greater");

        }
    }
}
