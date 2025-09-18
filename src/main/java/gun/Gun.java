package gun;

import gun.skin.Skin;

import java.util.ArrayList;

public abstract class Gun {
    protected String name;
    protected String fireMode;
    protected GunType type;
    protected int bodyDamage;
    protected int legDamage;
    protected int headDamage;
    protected int price;


    protected ArrayList<Skin> skins = new ArrayList<>();

    public Gun(String name,String fireMode,GunType type,int bodyDamage,int legDamage,int headDamage,int price) {
        this.name = name;
        this.fireMode = fireMode;
        this.type = type;
        this.bodyDamage = bodyDamage;
        this.legDamage = legDamage;
        this.headDamage = headDamage;
        this.price = price;
    }

    public void useSkin(Skin skin){skin.start();}
}