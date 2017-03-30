package model.gameboard;

/**
 * Created by khariollivierre on 3/30/17.
 */
public class Location2D {
    private int xCoord;
    private int yCoord;

    public Location2D(int xCoord, int yCoord) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }

    public int getxCoord() { return xCoord; }
    public int getyCoord() { return yCoord; }

    public void setxCoord(int xCoord) { this.xCoord = xCoord; }
    public void setyCoord(int yCoord) { this.yCoord = yCoord; }

    public Location convert() { return new Location(xCoord, -xCoord - yCoord, yCoord - (xCoord - (xCoord&1)) / 2); }
}
