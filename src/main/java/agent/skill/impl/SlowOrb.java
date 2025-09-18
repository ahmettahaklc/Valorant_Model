package agent.skill.impl;
import agent.skill.BasicSkill;

public class SlowOrb extends BasicSkill {
    public SlowOrb() {
        super(200);
    }

    @Override
    public void use() {
        System.out.println("Sage using 'Q' ability");
    }
}
