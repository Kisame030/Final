package player;

import ui.UserInterface;

public class HumanPlayer extends Player {
    private UserInterface ui;
    
    public HumanPlayer(UserInterface ui) {
        this.ui = ui;
    }
    
    public int guess() {
        ui.displayMessage("Enter your guess: ");
        int guess = ui.getInput();
        setLastGuess(guess);
        return guess;
    }
}