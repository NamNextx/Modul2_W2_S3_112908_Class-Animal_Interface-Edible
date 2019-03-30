package Animal;

import IEdibles.*;

public class Tigers extends Animals implements IEdible {
    @Override
    public String makeSound() {
        return " Tiger";
    }

    @Override
    public String howToEat() {
        return "Tiger eat";
    }
}
