public class Exercise1 {
    public static void main(String[] args) {
        int[] player1Cards = {10, 6, 8, 9, 7, 12, 7};
        int[] player2Cards = {7, 6, 9, 5, 2, 8, 11};
        int player1Wins = 0;
        int player2Wins = 0;
        System.out.println("****************************Play Card Busters!!!****************************\n");

        for (int round = 1; round <= 7 && player1Wins < 4 && player2Wins < 4; round++) {

            int player1Card = player1Cards[round - 1];
            int player2Card = player2Cards[round - 1];

            StringBuilder roundResult = new StringBuilder("Round No: " + round + " - ");
            if (player1Card > player2Card) {
                player1Wins++;
                roundResult.append(" Player 1 wins the round: ").append(player1Card).append(" beats ").append(player2Card);
            } else if (player1Card < player2Card) {
                player2Wins++;
                roundResult.append(" Player 2 wins the round: ").append(player2Card).append(" beats ").append(player1Card);
            } else {
                roundResult.append("Tie! ").append(player1Card).append(" ties with ").append(player2Card);
            }
            System.out.println(roundResult);
        }

        if (player1Wins > player2Wins) {
            System.out.println("\nPlayer One wins!! He won " + player1Wins + " rounds beating Player Two who won " + player2Wins + " rounds!");
        } else if (player1Wins < player2Wins) {
            System.out.println("\nPlayer Two wins!! He won " + player2Wins + " rounds beating Player One who won " + player1Wins + " rounds!");
        } else {
            System.out.println("\nThe game ends in a tie! Both players won " + player1Wins + " rounds each.");
        }
        System.out.println("Goodbye!");
    }
}
