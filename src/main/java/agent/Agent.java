package agent;

import agent.skill.Skill;

import java.util.ArrayList;

public abstract class Agent {

    protected String gender;
    protected String name;
    protected Role role;
    protected ArrayList<Skill> skills = new ArrayList<>();

    public Agent(String name, Role role,String gender) {
        this.name = name;
        this.role = role;
        this.gender = gender;
    }



    public String getName() {
        return this.name;
    }


    public void useSkill(Skill skill) {
        skill.run();
    }

}

