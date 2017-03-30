package model.tile;

import model.gameboard.Gameboard;
import model.gameboard.Location;

import java.util.ArrayList;

/**
 * Created by khariollivierre on 3/29/17.
 */
public class TilePlacementManager {
    private Gameboard board;

    public TilePlacementManager(Gameboard board){ this.board = board; }

    public void addTile(Location location, Tile tile) { board.addTile(location, tile); }
    public void removeTile(Location location) { board.removeTile(location); }
    public Tile getTile(Location location) { return board.getTile(location); }

    public Tile[] getNeighbors(Location location) {
        Tile[] neighbors = new Tile[6];
        neighbors[0] = getTile(location.north());
        neighbors[1] = getTile(location.northeast());
        neighbors[2] = getTile(location.southeast());
        neighbors[3] = getTile(location.south());
        neighbors[4] = getTile(location.southwest());
        neighbors[5] = getTile(location.northwest());
        return neighbors;
    }
}
