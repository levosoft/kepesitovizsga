package hu.nive.ujratervezes.kepesitovizsga.army;

public class Archer extends MilitaryUnit{

    public Archer() {
        damage = 20;
        hitPoints = 50;
        armored = false;
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
        super.sufferDamage(damage);
    }
}
