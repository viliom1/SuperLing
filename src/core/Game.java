package core;

import core.gfx.ImageLoader;
import display.Display;

import java.awt.*;
import java.awt.image.BufferStrategy;

/**
 * Created by Vili on 29-Apr-16.
 */
public class Game implements Runnable {
    private String title;
    private int width,height;
    private Thread thread;
    private Display display;
    private boolean isRunning;
    private BufferStrategy bs;
    private Graphics graphics;


    public Game(String title, int width, int height) {
        this.title = title;
        this.width = width;
        this.height = height;
        this.isRunning = false;
    }
    private void init(){
        this.display = new Display(title,width,height);
    }
    private void tick(){

    }
    private void render(){
        this.bs = this.display.getCanvas().getBufferStrategy();
        if (this.bs == null){
            this.display.getCanvas().createBufferStrategy(3);
            return;
        }
        this.graphics = this.bs.getDrawGraphics();
        this.graphics.clearRect(0,0,this.width,this.height);
        //FILL THE BUFFER
        this.graphics.drawImage(ImageLoader.loadImage("/images/bckg.jpg"),0,0,null);
        //DRAW THE BUFFER
        this.bs.show();
        this.graphics.dispose();
    }
    @Override
    public void run() {
        this.init();
        while(isRunning){
            this.tick();
            this.render();

        }
        try {
            this.stop();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void start(){
        if (!isRunning) {
            this.thread = new Thread(this);
            this.thread.start();
            this.isRunning = true;
        }
    }

    public synchronized void stop() throws InterruptedException {
        if(isRunning){
            this.thread.join();
            this.isRunning = false;
        }
    }
}
