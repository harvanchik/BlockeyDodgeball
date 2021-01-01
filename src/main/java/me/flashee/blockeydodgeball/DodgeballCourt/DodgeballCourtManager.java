package me.flashee.blockeydodgeball.DodgeballCourt;

import me.flashee.blockeydodgeball.BlockeyDodgeball;
import org.bukkit.configuration.ConfigurationSection;

import java.util.ArrayList;

public class DodgeballCourtManager {

    BlockeyDodgeball plugin;

    ArrayList<DodgeballCourt> dodgeballCourts;

    // constructor
    public DodgeballCourtManager(BlockeyDodgeball plugin) {
        this.plugin = plugin;
        buildDodgeballCourts();
    }

    private void buildDodgeballCourts() {
        dodgeballCourts = new ArrayList<>();
        ConfigurationSection section = plugin.getConfig().getConfigurationSection("courts");
        if (section != null) {
            for (String key : section.getKeys(false)) {
                dodgeballCourts.add(
                        new DodgeballCourt(
                                plugin.getConfig().getString("courts." + key + ".name"),
                                plugin.getConfig().getString("courts." + key + ".color"),
                                plugin.getConfig().getString("courts." + key + ".loc1"),
                                plugin.getConfig().getString("courts." + key + ".loc2"),
                                plugin.getConfig().getString("courts." + key + ".mid1"),
                                plugin.getConfig().getString("courts." + key + ".mid2"),
                                plugin
                        )
                );
            }

        } else {
            // no courts defined!
            System.out.println("[BlockeyDodgeball] No courts were defined in the config!");
        }
    }
}
