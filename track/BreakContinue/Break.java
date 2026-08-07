package track.BreakContinue;

public class Break {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            // System.out.println("Number: " + i);
            if (i == 8) {
                break;
            }
            System.out.println("Number: " + i);
        }
    }

}
