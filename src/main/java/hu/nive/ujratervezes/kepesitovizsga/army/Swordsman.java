package hu.nive.ujratervezes.kepesitovizsga.army;

import java.util.Random;

public class Swordsman extends MilitaryUnit{

    private int damageNum = 0;

    public Swordsman(boolean isArmored) {
        damage = 20;
        hitPoints = 50;
        armored = isArmored;
    }


    @Override
    public int getDamage() {
        return super.getDamage();
    }

    @Override
    public int getHitPoints() {
        return super.getHitPoints();
    }

    @Override
    public boolean isArmored() {
        return super.isArmored();
    }

    @Override
    public int doDamage() {
        return super.doDamage();
    }

    @Override
    public void sufferDamage(int damage) {

        damageNum++;

        if (damageNum == 1){
            hitPoints = hitPoints - 0;
        }else {
            super.sufferDamage(damage);
        }


    }

}
