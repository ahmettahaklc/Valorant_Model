package agent.skill.impl;
import agent.skill.UltimateSkill;

public class NeuralTheft extends UltimateSkill {
    public NeuralTheft() {
        super(7);
    }

    @Override
    public void use() {
        System.out.println("Cypher using 'X' ability");
    }
}
