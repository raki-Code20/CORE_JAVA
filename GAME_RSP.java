import java.util.Random;
import java.util.Scanner;

public class Game_SSP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] choices = {"rock", "paper", "scissors"};

        System.out.println("Welcome to Rock-Paper-Scissors!");

        String playAgain="yes";
        do {
            // Generate computer choice each round
            String computerChoice = choices[random.nextInt(3)];

            System.out.print("Enter your choice (rock, paper, scissors): ");
            String userChoice = scanner.nextLine().toLowerCase();

            // Validate input
            if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.println("❌ Invalid choice! Please select rock, paper, or scissors.");
                continue; // go back to the start of the loop
            }

            // Display computer choice
            System.out.println("Computer chose: " + computerChoice);

            // Compare choices
            if (userChoice.equals(computerChoice)) {
                System.out.println("It's a TIE 📍");
            } else if (
                    (userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                            (userChoice.equals("scissors") && computerChoice.equals("paper")) ||
                            (userChoice.equals("paper") && computerChoice.equals("rock"))
            ) {
                System.out.println("🎉 You WIN!");
            } else {
                System.out.println("😔 You LOSE!");
            }

            // Ask if player wants to continue
            System.out.print("Do you want to play again (yes/no)? ");
            playAgain = scanner.nextLine().toLowerCase();

        } while (playAgain.equals("yes"));

        System.out.println("Thanks for playing! 👋");
        scanner.close();
    }
}
