package nl.bioinf.oop.design.strategy;

public class SoaringFlybehaviour implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Soaring on thermals");
    }
}
