package agent.skill.impl;

import agent.skill.SignatureSkill;

public class HealingOrb extends SignatureSkill {
    public HealingOrb() {
        super(0, 45);
    }

    @Override
    public void use() {
        System.out.println("Sage using 'E' ability");
    }
}
