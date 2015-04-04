package com.dpproject.ballsurvive;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.dpproject.ballsurvive.gamestates.SplashMenu;

public class MyGame extends Game {
	
	public static final String TITLE="Survive BALL";
	public static final int WIDTH=540, HEIGHT=960;
	
	
	@Override
	public void create () {
		setScreen(new SplashMenu());
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	}
}
