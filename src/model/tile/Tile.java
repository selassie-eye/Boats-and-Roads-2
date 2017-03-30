package model.tile;

import model.terrain.Terrain;

import java.util.ArrayList;

/**
 * Created by khariollivierre on 3/29/17.
 */
public class Tile {
    ArrayList<TileEdge> edges;
    Terrain terrain;

    public Tile(ArrayList<TileEdge> edges, Terrain terrain, int rotation){
        this.edges = edges;
        this.terrain = terrain;
        rotate(rotation);
    }

    public ArrayList<TileEdge> getEdges() { return edges; }
    public TileEdge getEdge(int index){ return edges.get(index); }
    public Terrain getTerrain() { return terrain; }

    public void setEdges(ArrayList<TileEdge> edges) { this.edges = edges; }
    public void setEdge(int index, TileEdge edge){ edges.set(index, edge); }
    public void setTerrain(Terrain terrain){ this.terrain = terrain; }

    public void sourceRivers(){
        for (TileEdge edge : edges){
            if(edge.isRiver()) edge.setSource(true);
        }
    }

    private void rotate(int rotation){
        for(int i = 0; i < rotation; i++){
            edges.add(0, edges.remove(5));
        }
    }

}
