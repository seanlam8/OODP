public class CheeseBurgerStore extends AbstractBurgerStore {
    @Override
    Burger createBurger() {
        return new CheeseBurger();
    }
}
