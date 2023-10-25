package User;

import gun.skin.Skin;

import java.util.ArrayList;

public class User {
    private String username;
    protected int vp;
    protected ArrayList<Skin> skin = new ArrayList<>();

    public User(String username,int vp){
        this.username = username;
        this.vp = vp;
    }

    public void buyVp(int a){
        //this.vp=a+this.vp;
        this.vp+=a;
    }

    public int getVp() {
        return vp;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
