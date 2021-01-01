package me.flashee.blockeydodgeball;

import me.flashee.blockeydodgeball.DodgeballCourt.DodgeballCourtManager;
import me.flashee.blockeydodgeball.DodgeballPlayer.DodgeballPlayerManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class BlockeyDodgeball extends JavaPlugin {

    public DodgeballCourtManager dodgeballCourtManager;
    public DodgeballPlayerManager dodgeballPlayerManager;

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("[BlockeyDodgeball] Plugin has loaded successfully!");
        dodgeballCourtManager = new DodgeballCourtManager(this);
        dodgeballPlayerManager = new DodgeballPlayerManager(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public void callMe() {
        // ...
    }
}
