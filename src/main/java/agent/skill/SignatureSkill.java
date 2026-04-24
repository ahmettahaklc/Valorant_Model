package agent.skill;

public abstract class SignatureSkill implements Skill  {
    protected int price;

    public SignatureSkill(int price) {
        this.price = price;

    }

    @Override
    public void use() {

    }
}
