package nl.bioinf.oop.design.strategy;

public class FlappingFlyBehaviour implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Flapping wings");
    }
}
