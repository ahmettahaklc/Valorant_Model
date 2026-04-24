package agent.skill;

public abstract class CooldownSkill extends SignatureSkill {
    int cooldown;

    public CooldownSkill(int price, int cooldown) {

        super(price);
        this.cooldown = cooldown;
    }
}
