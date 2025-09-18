package agent.skill.impl;

import agent.skill.BasicSkill;
import agent.skill.Skill;

public class BarrierOrb extends BasicSkill {
    public BarrierOrb() {
        super(400);
    }

    @Override
    public void use() {
        System.out.println("Sage using 'C' ability");
    }
}
