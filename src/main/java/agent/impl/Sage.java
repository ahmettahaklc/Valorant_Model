package agent.impl;

import agent.Agent;
import agent.Role;
import agent.skill.impl.*;

public class Sage extends Agent {
    public Sage() {
        super("Sage", Role.SENTINEL, "Female");

        skills.add(new BarrierOrb());
        skills.add(new HealingOrb());
        skills.add(new SlowOrb());
        skills.add(new Resurrection());
    }
}
