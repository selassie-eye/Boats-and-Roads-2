package model.command;

import model.terrain.Terrain;

/**
 * Created by khariollivierre on 3/29/17.
 */
public class TileBuildCommand {
    private Terrain terrain;
    private boolean[] rivers;
    private boolean[] sources;

    public TileBuildCommand(){
        rivers = new boolean[6];
    }

    public Terrain getTerrain() { return terrain; }
    public boolean[] getRivers() { return rivers; }
    public boolean[] getSources() { return sources; }

    public void setTerrain(Terrain terrain) { this.terrain = terrain; }
    public void setRivers(boolean[] rivers) { this.rivers = rivers; }
    public void setSources(boolean[] sources) { this.sources = sources; }
}
