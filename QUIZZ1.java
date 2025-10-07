import java.util.Scanner;

public class Quizz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] answers = {1, 3};
        int[] guess = new int[answers.length];
        int score = 0;

        System.out.println("=============");
        System.out.println("QUIZZ STARTED");
        System.out.println("=============");

        String[] Questions = {"What is your Name?", "What is your age?"};
        String[][] Options = {
            {"1.Rakesh", "2.Rasool", "3.Sai", "4.Kiran"},
            {"1.25", "2.24", "3.26", "4.32"}
        };

        // Step 1: Display all questions
        for (int i = 0; i < Questions.length; i++) {
            System.out.println(Questions[i]);
            for (String option : Options[i]) {
                System.out.println(option);
            }
            System.out.println();
        }

        // Step 2: Collect answers with validation
        System.out.println("====================");
        System.out.println("Provide the answers");
        System.out.println("=====================");

        for (int i = 0; i < Questions.length; i++) {
            int userInput;

            while (true) {
                System.out.print("Answer for Question " + (i + 1) + ": ");
                userInput = scanner.nextInt();

                // ✅ Validate immediately
                if (userInput >= 1 && userInput <= 4) {
                    guess[i] = userInput;
                    break; // exit the while loop
                } else {
                    System.out.println("❌ Invalid option! Please enter between 1 and 4.");
                }
            }
        }

        // Step 3: Check answers
        for (int i = 0; i < Questions.length; i++) {
            if (guess[i] == answers[i]) {
                System.out.println("You're correct ✅✅");
                score++;
            } else {
                System.out.println("Wrong guess (❌) — Right one is " + answers[i]);
            }
        }

        System.out.println("\nYour total score is: " + score + "/" + Questions.length);
    }
}
