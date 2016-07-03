package core.characters;

import core.gfx.SpriteSheet;

public abstract class Character{
    private String name;
    private SpriteSheet animation;

    public Character(String name, SpriteSheet animation) {
        this.name = name;
        this.animation = animation;
    }
    


}
