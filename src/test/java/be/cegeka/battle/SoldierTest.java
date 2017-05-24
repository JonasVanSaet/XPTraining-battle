package be.cegeka.battle;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class SoldierTest {

    @Test
    public void construction_ASoldierMustHaveAName() {
        Soldier soldier = new Soldier("name");

        assertThat(soldier.getName()).isEqualTo("name");
    }

    @Test(expected = IllegalArgumentException.class)
    public void construction_ASoldierMustHaveAName_CannotBeNull() {
        new Soldier(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void construction_ASoldierMustHaveAName_CannotBeEmpty() {
        new Soldier("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void construction_ASoldierMustHaveAName_CannotBeBlank() {
        new Soldier("   ");
    }


    @Test
    public void soldierMustHaveAWeapon_defaultIsBareFists() {
        Soldier soldier = new Soldier("name");
        soldier.getWeapon();
        assertThat(soldier.getWeapon().getClass()).isEqualTo(BareFist.class);
    }


    @Test
    public void SoldierMustHaveAWeapon_setToAxe() {
        Soldier soldier = new Soldier("name");
        soldier.setWeapon(new Axe());
        soldier.getWeapon();
        assertThat(soldier.getWeapon().getClass()).isEqualTo(Axe.class);
    }


}