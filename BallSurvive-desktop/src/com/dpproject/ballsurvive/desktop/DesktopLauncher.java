package com.dpproject.ballsurvive.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.dpproject.ballsurvive.MyGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Aim For the Target";
		//config.useGL30 = true;
		config.useGL30 = false;
		config.resizable = false;
		config.height = 960;
		config.width = 540;
		new LwjglApplication(new MyGame(), config);
	}
}
