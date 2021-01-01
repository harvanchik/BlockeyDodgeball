package me.flashee.blockeydodgeball.DodgeballCourt;

import me.flashee.blockeydodgeball.BlockeyDodgeball;
import me.flashee.blockeydodgeball.DodgeballBall.DodgeballBallManager;
import me.flashee.blockeydodgeball.DodgeballPlayer.DodgeballPlayerManager;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.util.BoundingBox;

public class DodgeballCourt {

    private BlockeyDodgeball plugin;

    private DodgeballPlayerManager dodgeballPlayerManager;
    private DodgeballBallManager dodgeballBallManager;

    private String name;
    private String color;
    private final Location loc1;
    private final Location loc2;
    private final Location mid1;
    private final Location mid2;

    private BoundingBox court;
    private BoundingBox centerLine;

    // constructor
    public DodgeballCourt(String name, String color, String loc1, String loc2, String mid1, String mid2, BlockeyDodgeball plugin) {
        this.dodgeballPlayerManager = new DodgeballPlayerManager(plugin);
        this.dodgeballBallManager = new DodgeballBallManager(plugin);
        this.name = name;
        this.color = color;
        this.loc1 = stringToLocation(loc1);
        this.loc2 = stringToLocation(loc2);
        this.mid1 = stringToLocation(mid1);
        this.mid2 = stringToLocation(mid2);
        this.plugin = plugin;
        buildDodgeballCourt();
    }

    /**
     * Turn a string value of coordinates into a Location.
     * @param location A string value of the coordinates.
     * @return A Location.
     */
    private Location stringToLocation(String location) {
        String[] coords = location.split(" ");
        int x = Integer.parseInt(coords[0]);
        int y = Integer.parseInt(coords[1]);
        int z = Integer.parseInt(coords[2]);
        return new Location(Bukkit.getWorld("world"), x, y, z);
    }

    /**
     * Create the dodgeball court bounding box.
     */
    private void buildDodgeballCourt() {
        court = new BoundingBox(
                loc1.getX(), loc1.getY(), loc1.getZ(), loc2.getX(), loc2.getY(), loc2.getZ()
        );
        buildCenterLine();
    }

    /**
     * Create the dodgeball court's center line.
     */
    private void buildCenterLine() {
        centerLine = new BoundingBox(
                mid1.getX(), mid1.getY(), mid1.getZ(), mid2.getX(), mid2.getY(), mid2.getZ()
        );
    }
}
