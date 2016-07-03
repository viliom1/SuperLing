package core;

import core.Interfaces.GameLaunchable;
import display.Display;

public class Launcher {

    public static void main(String[] args) {
        GameLaunchable game = new Game("Super Ling",1300,700);
        game.start();
    }
}
