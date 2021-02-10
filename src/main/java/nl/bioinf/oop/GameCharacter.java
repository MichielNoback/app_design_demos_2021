package nl.bioinf.oop;

public class GameCharacter {
    String name;
    int vitality;
    double locationX;
    double locationY;
    double locationZ;
    String weaponType;
    int bazookaWeaponPower;
    int pistolWeaponPower;
    int laserWeaponPower;

    void shoot (double heading) {
        switch (this.weaponType) {
            case "bazooka":
                System.out.println("shooting bazooka at heading " + heading);
            case "pistol": // do something
            case "laser":// do something
        }
    }
}
