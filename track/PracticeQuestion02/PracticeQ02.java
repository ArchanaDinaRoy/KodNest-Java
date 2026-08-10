package track.PracticeQuestion02;

import java.util.Scanner;

class Student {
    int id;
    String name;
    int javaScore;
}

public class PracticeQ02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student first = new Student();
        first.id = scanner.nextInt();
        first.name = scanner.next();
        first.javaScore = scanner.nextInt();

        Student second = new Student();
        second.id = scanner.nextInt();
        second.name = scanner.next();
        second.javaScore = scanner.nextInt();

        System.out.println(first.id + " - " + first.name + " - " + first.javaScore);
        System.out.println(second.id + " - " + second.name + " - " + second.javaScore);

        if (first.javaScore > second.javaScore) {
            System.out.println(first.name + " has the higher Java score.");
        } else if (first.javaScore == second.javaScore) {
            System.out.println("Both students have the same Java score.");
        } else {
            System.out.println(second.name + " has the higher Java score.");
        }
        scanner.close();
    }
}
