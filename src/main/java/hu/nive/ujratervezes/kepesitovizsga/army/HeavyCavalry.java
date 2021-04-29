package hu.nive.ujratervezes.kepesitovizsga.army;

public class HeavyCavalry extends MilitaryUnit{

    private int damageNum = 0;

    public HeavyCavalry() {
        damage = 20;
        hitPoints = 150;
        armored = true;

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

        damageNum++;

        if(damageNum == 1){
            return damage * 3;
        }else{
            return damage;
        }

    }

    @Override
    public void sufferDamage(int damage) {
        super.sufferDamage(damage);
    }
}
