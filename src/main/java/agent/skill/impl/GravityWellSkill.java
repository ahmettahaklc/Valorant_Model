package agent.skill.impl;
import agent.skill.BasicSkill;

public class GravityWellSkill extends BasicSkill {


    public GravityWellSkill() {
        super(150);
    }

    @Override
    public void use()
    {
        System.out.println("Astra using 'Q' ability");
    }
}
