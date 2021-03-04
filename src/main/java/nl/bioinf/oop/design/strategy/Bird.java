package nl.bioinf.oop.design.strategy;

public abstract class Bird {
    protected FlyBehaviour flyBehaviour;

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void fly() {
        System.out.print(this.getClass().getSimpleName() + " ");
        this.flyBehaviour.fly();
    }

}
