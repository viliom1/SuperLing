package core.gfx;

import java.awt.image.BufferedImage;


/**
 * Created by Vili on 29-Apr-16.
 */
public class SpriteSheet {
    private BufferedImage sprite;

    public SpriteSheet(BufferedImage sprite) {
        this.sprite = sprite;
    }

    public BufferedImage crop(int x, int y, int width, int height){
        return this.sprite.getSubimage(x,y,width,height);
    }
}
