package game;

import player.Player;

public abstract class Game {
    public abstract void start();
    public abstract void end();
    public abstract Player getWinner();
}