package be.cegeka.battle;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class ArmyTest {

    @Test
    public void construction_AnArmyMustContainASoldier() {
        Army army = new Army("The good");
        Soldier soldier = new Soldier("name");

        army.addSoldier(soldier);

        assertThat(army.getSoldiers().get(0)).isEqualTo(soldier);
    }

    @Test
    public void killSoldier_newFrontmanShouldBeCreated() {
        Army army = new Army("The bad");
        Soldier john = new Soldier("John");
        Soldier steven = new Soldier("Steven");

        army.addSoldier(john);
        army.addSoldier(steven);

        army.killFrontman();

        assertThat(army.getSoldiers().get(0)).isEqualTo(steven);

    }

}