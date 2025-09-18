package agent.skill;

public abstract class UltimateSkill implements Skill {
    protected int requiredOrbs;

    public UltimateSkill(int requiredOrbs) {
        this.requiredOrbs = requiredOrbs;
    }

    protected UltimateSkill() {}
    @Override
    public void use() {

    }
}
