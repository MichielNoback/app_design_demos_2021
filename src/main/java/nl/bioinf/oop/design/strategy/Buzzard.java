package nl.bioinf.oop.design.strategy;

public class Buzzard extends Bird {
    public Buzzard() {
        this.flyBehaviour = new SoaringFlybehaviour();
    }
}
