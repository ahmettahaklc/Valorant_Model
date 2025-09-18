package org.example;
import User.User;
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
        skill1.use();
        Skill skill2 = new FromTheShadowsSkill();
        skill2.use();

        User user1 = new User("Predaking",1000,1000,10000);
        user1.buyVp(1000);
        System.out.println(user1.getVp());
        System.out.println(user1.getUsername());


    }
}