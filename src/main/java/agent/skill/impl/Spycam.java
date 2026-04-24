package agent.skill.impl;
import agent.skill.CooldownSkill;
import agent.skill.SignatureSkill;

public class Spycam extends CooldownSkill {

    public Spycam() {
        super(0, 15);
    }

    @Override
    public void use() {
        System.out.println("Cypher using 'E' ability");
    }
}
