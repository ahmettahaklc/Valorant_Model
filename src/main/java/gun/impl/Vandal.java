package gun.impl;

import gun.Gun;
import gun.GunType;
import gun.skin.Skin;
import gun.skin.impl.ElderFlame;
import gun.skin.impl.PrimeVandal;

public class Vandal extends Gun {
    public Vandal() {
        super("Vandal", type.RIFLES, 90);
    }

    @Override
    public void UseSkin(Skin skin) {
        super.UseSkin(skin);
    }
}
