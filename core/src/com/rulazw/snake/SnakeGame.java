package com.rulazw.snake;

import com.badlogic.gdx.Game;


public class SnakeGame extends Game {
	@Override
	public void create() {
		setScreen(new GameScreen());
	}
}