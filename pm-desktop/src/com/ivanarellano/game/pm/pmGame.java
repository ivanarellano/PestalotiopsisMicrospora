package com.ivanarellano.game.pm;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class pmGame extends Game implements ApplicationListener {
	public static final int SCREEN_WIDTH = 1280;
	public static final int SCREEN_HEIGHT = 720;
	
	public static Stage stage = new Stage(SCREEN_WIDTH, SCREEN_HEIGHT, false);
	public ScreenStack screenStack = new ScreenStack(this);

	@Override
	public void create() {
		Gdx.app.log("libGdx ver", Integer.toString(Gdx.app.getVersion()));
		
		Gdx.graphics.setVSync(true);
	}

	@Override
	public void dispose() {
		super.dispose();
	}

	@Override
	public void pause() {
		super.pause();
	}

	@Override
	public void resume() {
		super.resume();
	}

	@Override
	public void render() {
		super.render();
	}

	@Override
	public void resize(int width, int height) {
		super.resize(width, height);
	}
}
