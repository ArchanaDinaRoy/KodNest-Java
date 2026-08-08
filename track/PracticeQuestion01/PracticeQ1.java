package track.PracticeQuestion01;

public class PracticeQ1 {
    public static void main(String[] args) {
        int practiceDays = 5;
        int sessionsPerDay = 2;
        int revisionDay = 3;
        int finalDaySessionLimit = 1;
        int targetSessions = 7;
        int completedSessions = 0;

        // Build the weekly practice report
        for (int day = 1; day <= practiceDays; day++) {

            // Skip revision day
            if (day == revisionDay) {
                continue;
            }

            for (int session = 1; session <= sessionsPerDay; session++) {

                // On the final day, stop after Session 1
                if (day == practiceDays && session > finalDaySessionLimit) {
                    break;
                }

                System.out.println("Day " + day + " - Session " + session);
                completedSessions++;
            }
        }

        System.out.println("Completed Sessions: " + completedSessions);

        if (completedSessions >= targetSessions) {
            System.out.println("Target Achieved");
        } else {
            System.out.println("Target Pending");
        }
    }
}
