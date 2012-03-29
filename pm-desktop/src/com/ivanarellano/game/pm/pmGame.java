package com.ivanarellano.game.pm;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.ivanarellano.game.pm.screen.GameScreen;

public class PmGame extends Game implements ApplicationListener {
	public static final int SCREEN_WIDTH = 1280;
	public static final int SCREEN_HEIGHT = 720;
	
	public Stage stage;
	public ScreenStack screenStack = new ScreenStack(this);
	public Color bgColor = new Color(53.0f/255.0f, 58.0f/255.0f, 61.0f/255.0f, 1.0f);

	@Override
	public void create() {
		Gdx.app.log("libGdx ver", Integer.toString(Gdx.app.getVersion()));
		
		Gdx.graphics.setVSync(true);
		
		Gdx.input.setInputProcessor(stage);
		Gdx.input.setCatchBackKey(true);
		
		Assets.create();
		
		stage = new Stage((float) SCREEN_WIDTH, (float) SCREEN_HEIGHT, false);
		
		screenStack.add(new GameScreen(this));
	}

	@Override
	public void dispose() {
		super.dispose();
		Assets.manager.dispose();
	}

	@Override
	public void pause() {
		super.pause();
	}

	@Override
	public void resume() {
		Assets.manager.update();
		Assets.manager.finishLoading();
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
