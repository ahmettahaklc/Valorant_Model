package agent.skill.impl;

import agent.skill.KillRechargeSkill;
import agent.skill.SignatureSkill;

public class GateCrash extends KillRechargeSkill {

    public GateCrash(int price, int cooldown) {
        super(150, 2);
    }

    @Override
    public void use() {
        System.out.println("Yoru using 'E' ability");
    }
}
