package model.terrain;

import java.io.File;

/**
 * Created by khariollivierre on 3/29/17.
 */
public abstract class Terrain {
    private File sprite;

    public File getSprite() { return sprite; }
    public void setSprite(File sprite) { this.sprite = sprite; }
}
