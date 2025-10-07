import java.util.Random;
import java.util.Scanner;

public class SlotGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int balance = 100;
        String playAgain = "Y";
        String[] row;
        int bet;

        System.out.println("========================");
        System.out.println("* Welcome to the Slot Game *");
        System.out.println("( 🍉 🍊 🍏 🍎 🥭 )");
        System.out.println("========================");

        while(balance > 0 && playAgain.equalsIgnoreCase("Y")) {
            System.out.println("\nBalance in Account: $" + balance);

            // Input valid bet
            while (true) {
                System.out.print("Place your bet: $");
                bet = scanner.nextInt();
                scanner.nextLine(); // consume newline

                if(bet > balance) {
                    System.out.println("❌ Not sufficient funds! Try again.");
                } else if (bet <= 0) {
                    System.out.println("❌ Bet must be greater than zero!");
                } else {
                    break; // valid bet
                }
            }

            balance -= bet;

            // Spin the slot
            System.out.println("Spinning...");
            row = spinRow(random);
            printRow(row);

            // Calculate payout
            int payout = getPayout(row, bet);
            if(payout > 0) {
                System.out.println("🎉 You won $" + payout + "!");
                balance += payout;
            } else {
                System.out.println("😔 You lost this round.");
            }

            // Ask to play again
            System.out.print("Do you want to play again? [Y/N]: ");
            playAgain = scanner.nextLine();
        }

        System.out.println("\nGame Over! Your final balance is $" + balance);
        scanner.close();
    }

    // Spin the slot row
    static String[] spinRow(Random random) {
        String[] symbols = {"🍉","🍊","🍏","🍎","🥭"};
        String[] row = new String[3];
        for(int i = 0; i < row.length; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
        }
        return row;
    }

    // Print the slot row
    static void printRow(String[] row) {
        System.out.println("*****************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("*****************");
    }

    // Calculate payout based on row
    static int getPayout(String[] row, int bet) {
        // Three symbols match
        if(row[0].equals(row[1]) && row[0].equals(row[2])) {
            return switch (row[0]) {
                case "🍉" -> bet * 3;
                case "🍊" -> bet * 4;
                case "🍏" -> bet * 5;
                case "🍎" -> bet * 6;
                case "🥭" -> bet * 7;
                default -> 0;
            };
        }
        // Two symbols match (first two or last two)
        else if(row[0].equals(row[1]) || row[1].equals(row[2])) {
            String symbol = row[0].equals(row[1]) ? row[0] : row[1];
            return switch (symbol) {
                case "🍉" -> bet * 2;
                case "🍊" -> bet * 3;
                case "🍏" -> bet * 4;
                case "🍎" -> bet * 5;
                case "🥭" -> bet * 6;
                default -> 0;
            };
        }
        return 0; // no match
    }
}
