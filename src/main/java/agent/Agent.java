package agent;

import agent.skill.BasicSkill;
import agent.skill.Skill;
import agent.skill.UltimateSkill;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Agent {

    protected String gender;
    protected String name;
    protected Role role;
    protected ArrayList<Object> skills = new ArrayList<>();

    public Agent(String name, Role role,String gender) {
        this.name = name;
        this.role = role;
        this.gender = gender;
    }



    public String getName() {
        return this.name;
    }


    public void useSkill(Skill skill) {
        skill.use();
    }

}

