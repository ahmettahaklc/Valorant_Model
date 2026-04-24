package agent.skill.impl;

import agent.skill.BasicSkill;

public class Blindside extends BasicSkill {

    public Blindside() {
        super(250);
    }

    @Override
    public void use() {
        System.out.println("Yoru using 'Q' ability");
    }
}
