package agent.impl;

import agent.Agent;
import agent.Role;
import agent.skill.impl.CosmicDivideSkill;
import agent.skill.impl.GravityWellSkill;
import agent.skill.impl.Nebula_DissipateStarsSkill;
import agent.skill.impl.NovaPulseSkill;

public class Astra extends Agent {


    public Astra() {

        super("Astra", Role.CONTROLLER,"Female");

        skills.add(new GravityWellSkill());
        skills.add(new NovaPulseSkill());
        skills.add(new Nebula_DissipateStarsSkill());
        skills.add(new CosmicDivideSkill());
    }


}
