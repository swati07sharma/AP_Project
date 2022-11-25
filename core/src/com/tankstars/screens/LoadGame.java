package com.tankstars.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.tankstars.Tankstars;


public class LoadGame implements Screen {

    Tankstars game;
    Texture img;
    private static final int WIDTH = 280;
    private static final int HEIGHT = 89;

    private static final int RADIUS = 69;

    public LoadGame(Tankstars game){
        this.game = game;

    }

    @Override
    public void show() {
        img = new Texture("Load Game.jpg");
    }

    @Override
    public void resize(int width, int height) {
    }

    @Override
    public void render(float delta) {
        game.batch.begin();

        int x = 1496;
        int y = 335;

        int a = 1386;
        int b = 32;

        if ( (Gdx.input.getX() > a && Gdx.input.getX() < (a + RADIUS) ) && (Gdx.input.getY() > b && Gdx.input.getY() < (b + RADIUS) ) ) {
            if (Gdx.input.isTouched()) {
                this.dispose();
                resize(1920,1080 );
                game.setScreen(new MainScreen(game));
            }
        }
        else if ( (Gdx.input.getX() > x && Gdx.input.getX() < (x + WIDTH) ) && (Tankstars.height - Gdx.input.getY() > y && Tankstars.height - Gdx.input.getY() < (y + HEIGHT) ) ) {
            if (Gdx.input.isTouched()) {
                this.dispose();
                resize(1920,1080 );
                game.setScreen(new MainScreen(game));
            }
        }
        else{
            game.batch.draw(img, 0,0,1920,1080);
        }
        game.batch.end();
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}