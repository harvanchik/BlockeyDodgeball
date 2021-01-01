package me.flashee.blockeydodgeball.DodgeballPlayer;

import me.flashee.blockeydodgeball.BlockeyDodgeball;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.UUID;

public class DodgeballPlayerManager {

    BlockeyDodgeball plugin;

    HashMap<UUID, DodgeballPlayer> dodgeballPlayers;

    public DodgeballPlayerManager(BlockeyDodgeball plugin) {
        this.plugin = plugin;
        dodgeballPlayers = new HashMap<>();
    }

    /**
     * Create a new dodgeball player.
     * @param player The player to create a dodgeball player of.
     */
    public void createDodgeballPlayer(Player player) {
        dodgeballPlayers.put(player.getUniqueId(), new DodgeballPlayer(player, plugin));
    }

    /**
     * Remove a dodgeball player.
     * @param uuid The uuid of the dodgeball player to remove.
     */
    public void removeDodgeballPlayer(UUID uuid) {
        dodgeballPlayers.remove(uuid);
    }

    /**
     * Get a dodgeball player.
     * @param uuid The uuid of the dodgeball player to search for.
     * @return The dodgeball player.
     */
    public DodgeballPlayer getDodgeballPlayer(UUID uuid) {
        return dodgeballPlayers.get(uuid);
    }

    /**
     * Get all dodgeball players.
     * @return An array of all dodgeball players.
     */
    public DodgeballPlayer[] getDodgeballPlayers() {
        return dodgeballPlayers.values().toArray(new DodgeballPlayer[0]);
    }
}
