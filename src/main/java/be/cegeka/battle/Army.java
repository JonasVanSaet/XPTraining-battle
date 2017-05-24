package be.cegeka.battle;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.Validate;

public class Army {

    private String name;

    private List<Soldier> soldiers = new ArrayList<Soldier>();

    public Army(String name) {
        Validate.isTrue(isNotBlank(name));

        this.name = name;
    }

    public void addSoldier(Soldier soldier) {
        soldiers.add(soldier);
    }

    public List<Soldier> getSoldiers() {
        return soldiers;
    }

    public void killFrontman() {
        soldiers.remove(0);
    }

    public Soldier getFrontMan() {
        return soldiers.get(0);
    }

    public boolean fightWar(Army army) {

        while (army.getSoldiers().size() > 0) {
            if (getFrontMan().fight(army.getFrontMan())) {
                army.killFrontman();
            } else {
                killFrontman();
            }
            if (soldiers.size() <= 0) {
                System.out.println("lose");
                return false;
            }
        }
        System.out.println("win");
        return true;


    }

    public boolean containsSoldiers() {
        if (soldiers.size() > 0) {
            return true;
        }
        return false;
    }


}
