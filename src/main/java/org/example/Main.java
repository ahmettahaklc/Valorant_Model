package org.example;
import agent.Agent;
import agent.impl.Astra;
import agent.skill.Skill;
import agent.skill.impl.DarkCoverSkill;
import agent.skill.impl.FromTheShadowsSkill;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Skill skill1 = new DarkCoverSkill();
        skill1.run();
        Skill skill2 = new FromTheShadowsSkill();
        skill2.run();



    }
}