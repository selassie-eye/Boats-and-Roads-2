package model.gameboard;

import model.tile.Tile;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by khariollivierre on 3/29/17.
 */
public class Gameboard {
    private Map board;

    public Gameboard(){
        board = new HashMap<Location, Tile>();
    }

    public void addTile(Location location, Tile tile) { board.put(location, tile); }
    public void removeTile(Location location) { board.remove(location); }
    public Tile getTile(Location location) { return (Tile)board.get(location); }

    public Map getBoard() { return board; }
}
