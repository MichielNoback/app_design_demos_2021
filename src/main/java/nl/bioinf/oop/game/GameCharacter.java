package nl.bioinf.oop.game;

public class GameCharacter {
    public static final int MAX_VITALITY = 100;
    private String name;
    private int vitality;
    private Location location;
    private AbstractWeapon weapon;

    public GameCharacter(String name, Location location) {
        this(name, MAX_VITALITY, location);
    }

    public GameCharacter(String name, int vitality, Location location) {
        this.name = name;
        this.vitality = vitality;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public int getVitality() {
        return vitality;
    }

    public Location getLocation() {
        return location;
    }

    public AbstractWeapon getWeapon() {
        return weapon;
    }

    public void setWeapon(AbstractWeapon weapon) {
        this.weapon = weapon;
    }

    void shoot (double heading) {
        this.weapon.shoot(heading);
    }
}
