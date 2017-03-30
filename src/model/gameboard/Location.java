package model.gameboard;

/**
 * Created by khariollivierre on 3/29/17.
 */
public class Location {
    private int xCoord;
    private int yCoord;
    private int zCoord;

    public Location(int xCoord, int yCoord, int zCoord) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.zCoord = zCoord;
    }

    public int getxCoord() { return xCoord; }
    public int getyCoord() { return yCoord; }
    public int getzCoord() { return zCoord; }

    public void setxCoord(int xCoord) { this.xCoord = xCoord; }
    public void setyCoord(int yCoord) { this.yCoord = yCoord; }
    public void setzCoord(int zCoord) { this.zCoord = zCoord; }

    public Location north() { return new Location(xCoord, yCoord + 1, zCoord - 1); }
    public Location northeast() { return new Location(xCoord + 1, yCoord, zCoord - 1); }
    public Location southeast() { return new Location(xCoord + 1, yCoord - 1, zCoord); }
    public Location south() { return new Location(xCoord, yCoord - 1, zCoord + 1); }
    public Location southwest() { return new Location(xCoord - 1, yCoord, zCoord + 1); }
    public Location northwest() { return new Location(xCoord - 1, yCoord + 1, zCoord); }
}
