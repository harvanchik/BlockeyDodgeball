package me.flashee.blockeydodgeball;

import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.entity.Snowball;

public class Dodgeball {

    private String color;

    private Snowball dodgeballProjectile;
    private Item dodgeballItem;

    private Player dodgeballThrower;

    // constructor
    public Dodgeball(String color) {
        this.color = color;
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
