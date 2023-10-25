public class Player {
    private int hp = 100;
    private int shield;

    public Player(int shield){
        this.shield=shield;
    }

    public void buyShield(int s){
        this.shield=s;
    }

    public void takeDamage(int damage) {
        if (shield != 0) {
            this.hp = -damage;
        }
        else{
            this.shield=-damage;
        }
    }

    public int getHp() {
        return hp;
    }

    public int getShield() {
        return shield;
    }
}
