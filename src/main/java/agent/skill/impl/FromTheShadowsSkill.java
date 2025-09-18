package agent.skill.impl;
import agent.skill.UltimateSkill;

public class FromTheShadowsSkill extends UltimateSkill {
    public FromTheShadowsSkill() {
        super(7);
    }

    @Override
    public void use() {
        System.out.println("Omen using 'X' ability");
    }
}
