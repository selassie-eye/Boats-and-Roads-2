package model.command;

import model.gameboard.Location;

/**
 * Created by khariollivierre on 3/29/17.
 */
public class RemoveCommand {
    Location location;

    public RemoveCommand(Location location) { this.location = location; }

    public Location getLocation() { return location; }
    public void setLocation(Location location) { this.location = location; }
}
