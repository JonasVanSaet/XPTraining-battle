package be.cegeka.battle;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

import org.apache.commons.lang3.Validate;

public class Soldier {

    private String name;

    private Weapon weapon;

    public Soldier(String name) {
        Validate.isTrue(isNotBlank(name));

        this.name = name;

        this.weapon = new BareFist();
    }

    String getName() {
        return this.name;
    }


    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public boolean fight(Soldier soldier) {
        if (soldier.getWeapon().getWeaponDamage() > weapon.getWeaponDamage()) {
            return false;
        }
        return true;

    }

}
