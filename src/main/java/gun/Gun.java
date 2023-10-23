package gun;

import gun.skin.Skin;

import java.util.ArrayList;

public abstract class Gun {
    protected String name;
    protected GunType type;
    protected int damage;
    protected ArrayList<Skin> skins = new ArrayList<>();

    public Gun(String name,GunType type,int damage){
        this.name = name;
        this.type = type;
        this.damage = damage;
    }

    public void UseSkin(Skin skin){skin.start();}
}