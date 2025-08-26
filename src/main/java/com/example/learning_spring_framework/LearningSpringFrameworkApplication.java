package com.example.learning_spring_framework;

import com.example.learning_spring_framework.game.GameRunner;
import com.example.learning_spring_framework.game.MarioGame;
import com.example.learning_spring_framework.game.Pacman;
import com.example.learning_spring_framework.game.SuperContraGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearningSpringFrameworkApplication {

	public static void main(String[] args) {
//	 SpringApplication.run(LearningSpringFrameworkApplication.class, args);
//	 MarioGame game = new MarioGame();
//		 SuperContraGame game = new SuperContraGame();
		Pacman game = new Pacman();
		GameRunner runner = new GameRunner(game);
	runner.run();
		
	}

}
