package com.example.learning_spring_framework.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    @Autowired
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
