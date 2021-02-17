package nl.bioinf.oop.game;

public class Landmine extends AbstractWeapon{
    @Override
    void shoot(double heading) {
        System.out.println("[Landmine] explodes.");
    }
}
