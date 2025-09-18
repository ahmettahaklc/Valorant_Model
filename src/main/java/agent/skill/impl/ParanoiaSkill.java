package agent.skill.impl;

import agent.skill.BasicSkill;
import agent.skill.Skill;

public class ParanoiaSkill extends BasicSkill {

    public ParanoiaSkill() {
        super(250);
    }

    @Override
    public void use() {
        System.out.println("Omen using 'Q' ability");
    }
}
