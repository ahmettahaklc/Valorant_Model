package agent.skill.impl;
import agent.skill.BasicSkill;

public class NovaPulseSkill extends BasicSkill {

    public NovaPulseSkill() {
        super(150);
    }

    @Override
    public void use() {
        System.out.println("Astra using 'Q' ability");
    }
}
