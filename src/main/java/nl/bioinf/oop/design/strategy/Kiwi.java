package nl.bioinf.oop.design.strategy;

public class Kiwi extends Bird{
    public Kiwi() {
        this.flyBehaviour = new NoFlyBehaviour();
    }

    void mutateDramatically() {
        System.out.println(this.getClass().getSimpleName() + " growing wings!");
        this.flyBehaviour = new FlappingFlyBehaviour();
    }
}
