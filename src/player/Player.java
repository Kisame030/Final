package player;

public abstract class Player {
    private int lastGuess;
    
    public abstract int guess();
    
    public void setLastGuess(int lastGuess) {
        this.lastGuess = lastGuess;
    }
    
    public int getLastGuess() {
        return lastGuess;
    }
}
