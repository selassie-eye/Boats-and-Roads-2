package model.tile;

/**
 * Created by khariollivierre on 3/29/17.
 */
public class TileEdge {
    private boolean isRiver;
    private boolean isSource;

    public TileEdge(boolean isRiver, boolean isSource){
        this.isRiver = isRiver;
        this.isSource = isSource;
    }

    public boolean isRiver() { return isRiver; }
    public boolean isSource() {return isSource; }

    public void setRiver(boolean river){ isRiver = river; }
    public void setSource(boolean source){ isSource = source; }
}
