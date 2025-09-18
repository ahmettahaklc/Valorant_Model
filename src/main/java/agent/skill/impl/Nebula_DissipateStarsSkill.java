package agent.skill.impl;

import agent.skill.BasicSkill;
import agent.skill.Skill;

public class Nebula_DissipateStarsSkill extends BasicSkill {

    public Nebula_DissipateStarsSkill() {
        super(150);
    }

    @Override
    public void use() {
        System.out.println("Astra using 'E' ability");
    }
}
