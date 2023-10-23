package gun.impl;

import gun.Gun;
import gun.GunType;
import gun.skin.Skin;
import gun.skin.impl.ElderFlame;
import gun.skin.impl.PrimeVandal;

public class Vandal extends Gun {
    public Vandal() {
        super("Vandal", GunType.RIFLES, 90);

        super.skins.add(new ElderFlame());
        super.skins.add(new PrimeVandal());
    }


}
