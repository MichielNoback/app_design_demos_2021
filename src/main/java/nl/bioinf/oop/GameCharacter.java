package nl.bioinf.oop;

public class GameCharacter {
    private String name;
    private int vitality;
    private Location location;
    private AbstractWeapon weapon;

    public GameCharacter(String name, int vitality, Location location) {
        this.name = name;
        this.vitality = vitality;
        this.location = location;
    }

    void shoot (double heading) {
        this.weapon.shoot(heading);
    }
}
