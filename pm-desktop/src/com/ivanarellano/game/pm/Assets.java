package com.ivanarellano.game.pm;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetErrorListener;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

public class Assets {
	public static AssetManager manager;
	public static AssetErrorListener managerError;
	public static TextureAtlas atlas;
	
    public static void create() {
    	manager = new AssetManager();
    	managerError = new AssetErrorListener() {
			@Override
			public void error(String fileName, Class type, Throwable t) {
				Gdx.app.error("AssetManagerTest", "couldn't load asset '" + fileName + "'", (Exception)t);						
			}
		};
		
    	manager.setErrorListener(managerError);
    	Texture.setAssetManager(manager);
    	init();    	
    }
    
    private static void init() {
    	manager.load("data/pack", TextureAtlas.class);
    	manager.finishLoading();
    	atlas = manager.get("data/pack", TextureAtlas.class);
    }
    
    public static void loadTexture(String...src) {
        for (String file : src)
           manager.load(file, Texture.class);
    }
    
    public static Texture getTexture(String src) {
        return manager.get(src, Texture.class);  
    }
    
    public static void unload(String...toUnload) {
    	for (String file : toUnload)
    		manager.unload(file);
    }
}
