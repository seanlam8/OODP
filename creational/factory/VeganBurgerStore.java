public class VeganBurgerStore extends AbstractBurgerStore {
    @Override
    Burger createBurger() {
        return new VeganBurger();
    }
}
