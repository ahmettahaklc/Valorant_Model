package agent.skill.impl;
import agent.skill.SignatureSkill;

public class Spycam extends SignatureSkill {

    public Spycam() {
        super(0, 15);
    }

    @Override
    public void use() {
        System.out.println("Cypher using 'E' ability");
    }
}
