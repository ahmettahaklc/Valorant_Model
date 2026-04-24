package agent.skill.impl;
import agent.skill.CooldownSkill;
import agent.skill.SignatureSkill;
import agent.skill.Skill;

public class DarkCoverSkill extends CooldownSkill {
    public DarkCoverSkill() {
        super(150,15);
    }

    @Override
    public void use() {
        System.out.println("Omen using 'E' ability");
    }
}
