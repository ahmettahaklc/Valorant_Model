package agent.skill;

public abstract class BasicSkill implements Skill {
    protected int price;

    public BasicSkill(int price) {
        this.price = price;
    }

    @Override
    public void use() {

    }
}
