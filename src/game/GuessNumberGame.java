package game;

import player.Player;

public class GuessNumberGame extends Game {
    private Player player1;
    private Player player2;
    private int secretNumber;
    
    public GuessNumberGame(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.secretNumber = generateSecretNumber();
    }
    
    private int generateSecretNumber() {
        // Generate a random secret number between 1 and 100
        return (int)(Math.random() * 5 + 1);
    }
    
    public void start() {
        System.out.println("The game has started!");
        // Continue playing until one player guesses the correct number
        while (true) {
            int guess1 = player1.guess();
            int guess2 = player2.guess();
            if (checkGuess(guess1)) {
                end();
                return;
            }
            if (checkGuess(guess2)) {
                end();
                return;
            }
        }
    }
    
    public void end() {
        System.out.println("The game has ended!");
    }
    
    public Player getWinner() {
        // Return the player who made the correct guess
        if (player1.getLastGuess() == secretNumber) {
            return player1;
        } else if (player2.getLastGuess() == secretNumber) {
            return player2;
        }
        return null;
    }
    
    public boolean checkGuess(int guess) {
        return guess == secretNumber;
    }
}
