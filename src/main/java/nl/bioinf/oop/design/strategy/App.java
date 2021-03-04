package nl.bioinf.oop.design.strategy;

public class App {
    public static void main(String[] args) {
        Bird buzzard = new Buzzard();
        buzzard.fly();
        System.out.println("Buzzard get shot");
        buzzard.setFlyBehaviour(new NoFlyBehaviour());
        buzzard.fly();

        Bird kiwi = new Kiwi();
        kiwi.fly();
        ((Kiwi)kiwi).mutateDramatically();
        kiwi.fly();

    }
}
