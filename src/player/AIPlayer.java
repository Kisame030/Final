package player;

import ui.UserInterface;

public class AIPlayer extends Player {
	private UserInterface ui;
    
    public AIPlayer(UserInterface ui) {
        this.ui = ui;
    }
    
    public int guess() {
        int guess = (int)(Math.random() * 5 + 1);
        setLastGuess(guess);
        return guess;
    }
}