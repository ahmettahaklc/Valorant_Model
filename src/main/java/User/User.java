package User;

import gun.skin.Skin;

import java.util.ArrayList;

public class User {
    private String username;
    protected int vp;
    protected int rp;
    protected int kc;
    protected ArrayList<Skin> skin = new ArrayList<>();

    public User(String username,int vp, int rp,int kc){
        this.username = username;
        this.vp = vp;
        this.rp = rp;
        this.kc = kc;
    }

    public void buyVp(int buyingVp){
        //this.vp=a+this.vp;
        this.vp+=buyingVp;
    }

    public void buyRp(int buyingRp){
        this.rp+=buyingRp;
    }

    public void buyKc(int buyingKc){
        this.kc+=buyingKc;
    }

    public int getVp() {
        return vp;
    }

    public int getRp() { return rp; }

    public int getKc() { return kc; }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
