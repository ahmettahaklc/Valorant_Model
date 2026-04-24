package agent.skill.impl;

import agent.skill.UltimateSkill;

public class DimensionalDrift extends UltimateSkill {

    public DimensionalDrift() {
        super(8);
    }
    @Override
    public void use() {
        System.out.println("Yoru using 'X' ability");
    }
}
