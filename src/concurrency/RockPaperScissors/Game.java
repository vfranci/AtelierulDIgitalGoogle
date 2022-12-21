package concurrency.RockPaperScissors;

public class Game {
    public static String determineWinner(Player player1, Player player2) {
        String choice1 = player1.getChoice();
        String choice2 = player2.getChoice();

        if (choice1.equals(choice2)) {
            return "It's a tie!";
        }

        if (choice1.equals("rock")) {
            if (choice2.equals("scissors")) {
                return "Player 1 wins!";
            } else {
                return "Player 2 wins!";
            }
        }

        if (choice1.equals("paper")) {
            if (choice2.equals("rock")) {
                return "Player 1 wins!";
            } else {
                return "Player 2 wins!";
            }
        }

        if (choice1.equals("scissors")) {
            if (choice2.equals("paper")) {
                return "Player 1 wins!";
            } else {
                return "Player 2 wins!";
            }
        }

        return "Invalid choices.";
    }
}

