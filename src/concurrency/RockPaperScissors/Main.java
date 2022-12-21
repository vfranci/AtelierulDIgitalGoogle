package concurrency.RockPaperScissors;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();

        player1.start();
        player2.start();

        String winner = Game.determineWinner(player1, player2);
        System.out.println("P1: " + player1.getChoice());
        System.out.println("P2: " + player2.getChoice());
        System.out.println(winner);

    }
}
