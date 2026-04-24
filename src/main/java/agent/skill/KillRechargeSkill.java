package agent.skill;

public class KillRechargeSkill extends SignatureSkill{
    int killRecharge;

    public KillRechargeSkill(int price, int killRecharge) {
        super(price);
        this.killRecharge = killRecharge;
    }

    @Override
    public void use() {}

}
