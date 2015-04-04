package com.dpproject.ballsurvive.managers;

import com.dpproject.ballsurvive.gamestates.GameState;
import com.dpproject.ballsurvive.gamestates.PlayState;

public class GameStateManager {

	//current game state
	private GameState gameState;
	
	public static final int MENU = 0;
	public static final int GAME = 1;
	
	public GameStateManager() {
		setState(GAME);
	}
	
	public void setState(int state) {
		
		if(gameState != null) gameState.dispose();
		
		if(state == MENU) {
			//menu state
			
			//gameState = new MenuState(this);
		}
		else if(state == GAME) {
			//game state
			
			gameState = new PlayState(this);
		}
	}
	
	public void update(float dt){
		gameState.update(dt);
	}
	
	public void draw(){
		gameState.draw();
	}
}
