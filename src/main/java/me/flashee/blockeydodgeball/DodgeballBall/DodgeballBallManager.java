package me.flashee.blockeydodgeball.DodgeballBall;

import me.flashee.blockeydodgeball.BlockeyDodgeball;

import java.util.ArrayList;

public class DodgeballBallManager {

    BlockeyDodgeball plugin;

    ArrayList<DodgeballBall> dodgeballBalls;

    public DodgeballBallManager(BlockeyDodgeball plugin) {
        this.plugin = plugin;
        dodgeballBalls = new ArrayList<>();
    }

    public void summonDodgeballBall() {
        new DodgeballBall(plugin);
    }
}
