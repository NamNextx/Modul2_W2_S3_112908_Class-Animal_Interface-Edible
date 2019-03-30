package Animal;
import IEdibles.*;

public class Chickens extends Animals implements IEdible{

    @Override
    public String makeSound(){
        return "Chicken";
    }
    @Override
    public String howToEat(){
        return "Chicken could be Fried";
    }

}
