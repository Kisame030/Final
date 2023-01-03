package ui;

import java.util.Scanner;

public class ConsoleUI extends UserInterface {
    private Scanner scanner;
    
    public ConsoleUI() {
        this.scanner = new Scanner(System.in);
    }
    
    public void displayMessage(String message) {
        System.out.println(message);
    }
    
    public int getInput() {
        return scanner.nextInt();
    }
}