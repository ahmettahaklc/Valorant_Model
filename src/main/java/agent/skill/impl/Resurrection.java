package agent.skill.impl;

import agent.Role;
import agent.skill.UltimateSkill;

public class Resurrection extends UltimateSkill {
    public Resurrection() {
        super(7);
    }

    @Override
    public void use() {
        System.out.println("Sage using 'X' ability");
    }
}
