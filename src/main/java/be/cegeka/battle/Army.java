package be.cegeka.battle;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.Validate;

public class Army {

    private String name;

    private List<Soldier> soldiers = new ArrayList<Soldier>();

    private IHeadquarters headquarters;

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

        if (army.containsSoldiers()) {
            if (containsSoldiers()) {
                if (getFrontMan().fight(army.getFrontMan())) {
                    army.killFrontman();
                } else {
                    killFrontman();
                }
                fightWar(army);
            } else {
                return false;
            }
        }
        return true;

    }

    public boolean containsSoldiers() {
        if (soldiers.size() > 0) {
            return true;
        }
        return false;
    }


}
