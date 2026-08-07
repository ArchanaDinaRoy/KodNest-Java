public class Main1 {
    public static void main(String[] args) {
        int marks = 68;
        int attendance = 80;
        int practiceDays = 3;

        // Check placement readiness
        String result = (marks >= 60 && attendance >= 75)
                ? "Placement Ready"
                : "Continue Preparation";

        // Print the message
        System.out.println(result);

        // Print practice days
        for (int i = 1; i <= practiceDays; i++) {
            System.out.println("Practice Day " + i);
        }
    }
}