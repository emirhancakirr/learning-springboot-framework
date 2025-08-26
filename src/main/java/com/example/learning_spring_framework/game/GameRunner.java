package com.example.learning_spring_framework.game;

public class GameRunner {
    private GameConsole gameConsole;
    public GameRunner(GameConsole game) {
        this.gameConsole = game;
    }

    public void run(){
        gameConsole.up();
        gameConsole.left();
        gameConsole.right();
        gameConsole.down();
    }
}
