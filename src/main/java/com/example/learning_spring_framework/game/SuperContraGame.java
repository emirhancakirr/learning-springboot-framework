package com.example.learning_spring_framework.game;

import org.springframework.stereotype.Component;

@Component
public class SuperContraGame implements GameConsole {
    public void up(){
        System.out.println("SuperContra up");
    }

    public  void down(){
        System.out.println("SuperContra down");
    }

    public void right(){
        System.out.println("SuperContra right");
    }

    public  void left(){
        System.out.println("SuperContra left");
    }
}
