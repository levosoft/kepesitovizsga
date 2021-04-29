package hu.nive.ujratervezes.kepesitovizsga.army;

public abstract class MilitaryUnit {

    protected int damage;
    protected int hitPoints;
    protected boolean armored;

    public MilitaryUnit() {
        this.damage = 0;
        this.hitPoints = 0;
        this.armored = false;
    }

    public int getDamage() {
        return damage;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public boolean isArmored() {
        return armored;
    }

    public int doDamage() {
        return damage;
    }

    public void sufferDamage(int damage){
        if (armored == true){
            hitPoints = hitPoints - damage/2;
        }else{
            hitPoints = hitPoints - damage;
        }
    }
}
