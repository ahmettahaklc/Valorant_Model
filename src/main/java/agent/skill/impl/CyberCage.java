package agent.skill.impl;
import agent.skill.BasicSkill;

public class CyberCage extends BasicSkill {

    public CyberCage() {
        super(100);
    }

    @Override
    public void use() {
           System.out.println("Cypher using 'Q' ability");
    }
}
