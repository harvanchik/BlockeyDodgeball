package me.flashee.blockeydodgeball.DodgeballBall;

import me.flashee.blockeydodgeball.BlockeyDodgeball;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.entity.Snowball;

public class DodgeballBall {

    BlockeyDodgeball plugin;

    private String color;

    private Snowball dodgeballProjectile;
    private Item dodgeballItem;

    private Player dodgeballThrower;

    // constructor
    public DodgeballBall(BlockeyDodgeball plugin) {
        this.plugin = plugin;
        throwDodgeball();
    }

    private void throwDodgeball() {

    }

    /**
     * Remove the dodgeball in the form that it exists.
     */
    public void removeDodgeball() {
        if (dodgeballProjectile != null) {
            dodgeballProjectile.remove();
        }
        if (dodgeballItem != null) {
            dodgeballItem.remove();
        }
    }
}
