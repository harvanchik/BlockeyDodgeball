package me.flashee.blockeydodgeball.DodgeballPlayer;

import me.flashee.blockeydodgeball.BlockeyDodgeball;
import org.bukkit.entity.Player;

public class DodgeballPlayer {

    BlockeyDodgeball plugin;

    private final Player player;

    private boolean hasDodgeball;

    // constructor
    public DodgeballPlayer(Player player, BlockeyDodgeball plugin) {
        this.player = player;
        this.plugin = plugin;
    }
}
