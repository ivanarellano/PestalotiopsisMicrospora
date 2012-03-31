package com.ivanarellano.game.pm;

import java.util.Stack;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;

public class ScreenStack {
	Game game;
	public Stack<Screen> list = new Stack<Screen>();
	
	public ScreenStack(Game game) {
		this.game = game;
	}
	
	public void add(Screen screen) {
		list.add(screen);
		setScreen(screen);
	}
	
	public void setPrevious() {
		if (!list.empty())
			list.pop();
		
		if (!(list.size() <= 1)) {
			setScreen(list.peek());
		}
		else {
			Gdx.app.exit();
		}
	}
	
	private void setScreen(Screen screen) {
		game.setScreen(list.peek());
	}
}