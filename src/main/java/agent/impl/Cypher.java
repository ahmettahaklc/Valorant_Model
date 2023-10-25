package agent.impl;

import agent.Agent;
import agent.Role;
import agent.skill.impl.CyberCage;
import agent.skill.impl.NeuralTheft;
import agent.skill.impl.Spycam;
import agent.skill.impl.Trapwire;

public class Cypher extends Agent {

    public Cypher() {
        super("Cypher", Role.SENTINEL, "Male");

     skills.add(new Trapwire());
     skills.add(new CyberCage());
     skills.add(new Spycam());
     skills.add(new NeuralTheft());
    }
}
