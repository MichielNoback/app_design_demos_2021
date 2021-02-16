package nl.bioinf.oop;

public class Bazooka extends AbstractWeapon {
    @Override
    public void shoot(double heading) {
        System.out.println("[Bazooka] shooting a big grenade.");
    }
}
