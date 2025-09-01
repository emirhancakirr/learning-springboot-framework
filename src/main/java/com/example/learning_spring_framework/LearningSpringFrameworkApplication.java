package com.example.learning_spring_framework;

import com.example.learning_spring_framework.game.GameRunner;
import com.example.learning_spring_framework.game.MarioGame;
import com.example.learning_spring_framework.game.Pacman;
import com.example.learning_spring_framework.game.SuperContraGame;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.
		context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearningSpringFrameworkApplication {

	public static void main(String[] args) {
	 ConfigurableApplicationContext context =  SpringApplication.run(LearningSpringFrameworkApplication.class, args);
//	 MarioGame game = new MarioGame();
//		 SuperContraGame game = new SuperContraGame();
//		Pacman game = new Pacman();

		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();
		
	}

}
