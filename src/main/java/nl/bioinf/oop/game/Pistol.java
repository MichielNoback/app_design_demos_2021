package nl.bioinf.oop.game;

public class Pistol extends AbstractWeapon {
    @Override
    void shoot(double heading) {
        System.out.println("[Pistol] shooting a big grenade.");
    }
}
