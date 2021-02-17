package nl.bioinf.oop.game;

public abstract class AbstractWeapon {
    abstract void shoot(double heading);

    public String getName() {
        return this.getClass().getSimpleName();
    }
}
