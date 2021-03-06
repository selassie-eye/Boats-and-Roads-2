package model.tile;

import model.terrain.*;

import java.util.ArrayList;

/**
 * Created by khariollivierre on 3/29/17.
 */
public class TileBuilder {
    private Terrain terrain;
    private ArrayList<TileEdge> edges;
    private int rotation;

    public TileBuilder() { edges = new ArrayList<>(); }

    public void buildEdge(Boolean river, Boolean source, int index) { edges.add(index, new TileEdge(river, source)); }
    public void buildTerrain(Terrain terrain) { this.terrain = terrain; }

    public Tile buildTile(int rotation) { return new Tile(edges, terrain, rotation); }
    public Tile buildSeaTile() {
        terrain = new Sea();
        for (int i = 0; i < 6; i++){ buildEdge(false, true, i); }
        return buildTile(rotation);
    }

    private void clear() {
        // terrain = new NullTerrain();
        edges.clear();
    }
}
