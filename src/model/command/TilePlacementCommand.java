package model.command;

import model.gameboard.Location;
import model.tile.Tile;

/**
 * Created by khariollivierre on 3/29/17.
 */
public class TilePlacementCommand {
    private Tile tile;
    private Location location;

    public TilePlacementCommand(Tile tile, Location location){
        this.tile = tile;
        this.location = location;
    }

    public Tile getTile() { return tile; }
    public Location getLocation() { return location; }

    public void setTile(Tile tile) { this.tile = tile; }
    public void setLocation(Location location) { this.location = location; }
}
