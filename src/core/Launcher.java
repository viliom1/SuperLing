package core;

import display.Display;

public class Launcher {

    public static void main(String[] args) {
        Game game = new Game("Super Ling",1300,700);
        game.start();
    }
}
