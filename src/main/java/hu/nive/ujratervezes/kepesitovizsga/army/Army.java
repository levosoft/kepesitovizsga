package hu.nive.ujratervezes.kepesitovizsga.army;

import java.util.ArrayList;
import java.util.List;

public class Army {


    private int armyDamage;
    private List<MilitaryUnit> units = new ArrayList<>();

    public int getArmySize() {
        return units.size();
    }

    public int getArmyDamage() {
        return armyDamage;
    }

    public void addUnit(MilitaryUnit unit){
        units.add(unit);
    }

    public void damageAll(int i) {

        for (MilitaryUnit unit : units) {
            unit.sufferDamage(i);
            if (unit.getHitPoints() <= 25){
                units.remove(unit);
            }
        }

    }
}
