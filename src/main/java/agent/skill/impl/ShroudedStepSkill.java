package agent.skill.impl;

import agent.skill.BasicSkill;
import agent.skill.Skill;

public class ShroudedStepSkill extends BasicSkill {
    public ShroudedStepSkill() {
        super(100);
    }

    @Override
    public void use() {
        System.out.println("Omen using 'C' ability");
    }
}
