package agent;

import agent.skill.Skill;

import java.util.ArrayList;

public abstract class Agent {

    protected int hp = 100;
    protected int shield = 50;
    protected String name;
    protected Role role;
    protected ArrayList<Skill> skills = new ArrayList<>();

    public Agent(String name, Role role) {
        this.name = name;
        this.role = role;
    }

    public int getHp() {
        return this.hp;
    }

    public int getShield() {
        return this.shield;
    }

    public String getName() {
        return this.name;
    }


    public void useSkill(Skill skill) {
        skill.run();
    }

}

