package agent.skill.impl;

import agent.skill.BasicSkill;
import agent.skill.Skill;

public class Trapwire extends BasicSkill {

    public Trapwire() {
        super(200);
    }

    @Override
    public void use() {
        System.out.println("Cypher using 'C' ability");
    }
}
