package nl.bioinf.oop.design.strategy;

public class NoFlyBehaviour implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("Can only walk");
    }
}
