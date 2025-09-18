package agent.skill;

public abstract class SignatureSkill implements Skill  {
    protected int price;
    protected int cooldown;

    public SignatureSkill(int price, int cooldown) {
        this.price = price;
        this.cooldown = cooldown;
    }

    @Override
    public void use() {

    }
}
