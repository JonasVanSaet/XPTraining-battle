package be.cegeka.battle;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;

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

        assertThat(army.getFrontMan()).isEqualTo(steven);
    }

    @Test
    public void armyFightsWar_AlliesWin() {
        Army allies = new Army("allies");
        Army axis = new Army("axis");

        Soldier john = new Soldier("John");
        Soldier steven = new Soldier("Steven");


        Soldier gunter = new Soldier("Gunter");
        Soldier adolf = new Soldier("Adolf");

        allies.addSoldier(john);
        allies.addSoldier(steven);

        axis.addSoldier(gunter);
        axis.addSoldier(adolf);


        assertTrue(allies.fightWar(axis));
    }

    @Test
    public void armyFightsWar_AxisWin() {
        Army allies = new Army("allies");
        Army axis = new Army("axis");

        Soldier john = new Soldier("John");
        Soldier steven = new Soldier("Steven");

        Soldier gunter = new Soldier("Gunter");
        Soldier adolf = new Soldier("Adolf");


        allies.addSoldier(john);
        allies.addSoldier(steven);

        axis.addSoldier(gunter);
        axis.addSoldier(adolf);


        assertTrue(axis.fightWar(allies));
    }


}