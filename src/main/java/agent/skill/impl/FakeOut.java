package agent.skill.impl;

import agent.skill.BasicSkill;

public class FakeOut extends BasicSkill {

    public FakeOut() {
        super(200);
    }

    @Override
    public void use() {
        System.out.println("Yoru using 'C' ability");
    }
}
