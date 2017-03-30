package model.tile;

import model.gameboard.Gameboard;
import model.gameboard.Location;
import model.command.RemoveCommand;
import model.command.TileBuildCommand;
import model.command.TilePlacementCommand;
import model.terrain.Terrain;

/**
 * Created by khariollivierre on 3/29/17.
 */
public class TileCommandDispatcher {
    private TileBuilder tileBuilder;
    private TilePlacementManager tilePlacementManager;

    public TileCommandDispatcher(Gameboard board){
        tileBuilder = new TileBuilder();
        tilePlacementManager = new TilePlacementManager(board);
    }

    public Tile execute(TileBuildCommand command){
        boolean[] rivers = command.getRivers();
        boolean[] sources = command.getSources();
        Terrain terrain = command.getTerrain();

        for (int i = 0; i < 6; i++){ tileBuilder.buildEdge(rivers[i], sources[i], i); }
        tileBuilder.buildTerrain(terrain);

        return tileBuilder.buildTile();
    }

    public void execute(TilePlacementCommand command){
        Location location = command.getLocation();
        Tile tile = command.getTile();
        tilePlacementManager.addTile(location, tile);
    }

    public void execute(RemoveCommand command){
        Location location = command.getLocation();
        tilePlacementManager.removeTile(location);
    }
}
