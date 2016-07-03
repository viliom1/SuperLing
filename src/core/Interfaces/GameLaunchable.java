package core.Interfaces;

/**
 * Created by Vili on 03-Jul-16.
 */
public interface GameLaunchable extends Runnable {
    void start();
    void stop() throws InterruptedException;
}
