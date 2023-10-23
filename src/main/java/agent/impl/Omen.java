package agent.impl;

import agent.Agent;
import agent.Role;
import agent.skill.impl.DarkCoverSkill;
import agent.skill.impl.FromTheShadowsSkill;
import agent.skill.impl.ParanoiaSkill;
import agent.skill.impl.ShroudedStepSkill;

public class Omen extends Agent {


    public Omen() {

        super("Omen", Role.CONTROLLER);

        skills.add(new ShroudedStepSkill());
        skills.add(new ParanoiaSkill());
        skills.add(new DarkCoverSkill());
        skills.add(new FromTheShadowsSkill());

    }


}


