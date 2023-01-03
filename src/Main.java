import game.GuessNumberGame;
import player.HumanPlayer;
import player.Player;
import player.AIPlayer;
import ui.ConsoleUI;
import ui.UserInterface;

public class Main {
    public static void main(String[] args) {
        // Create a console user interface
        UserInterface ui = new ConsoleUI();
        UserInterface aii = new  ConsoleUI();
        
        // Create a human player and an AI player
        Player human = new HumanPlayer(ui);
        Player ai = new AIPlayer(aii);
        
        // Create a new guess the number game with the human and AI players
        GuessNumberGame game = new GuessNumberGame(human, ai);
        
        // Start the game
        game.start();
        
        // Get the winner of the game
        Player winner = game.getWinner();
        
        // Display the winner
        if (winner == human) {
            ui.displayMessage("You won!");
        } else if (winner == ai) {
            ui.displayMessage("The AI won!");
        } else {
            ui.displayMessage("The game was a tie!");
        }
    }
}
