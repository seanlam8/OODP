public class Main {
    public static void main(String[] args) {
        AbstractBurgerStore cheeseBurgerStore = new CheeseBurgerStore();
        AbstractBurgerStore veganBurgerStore = new VeganBurgerStore();

        Burger cheeseBurger = cheeseBurgerStore.createBurger();
        Burger veganBurger = veganBurgerStore.createBurger();

        cheeseBurger.printDescription();
        veganBurger.printDescription();
    }
}
