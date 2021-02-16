package nl.bioinf.oop;

public abstract class AbstractWeapon {
    abstract void shoot(double heading);

    public String getName() {
        return this.getClass().getSimpleName();
    }
}
