package Fruits;
import IEdibles.*;

public class Apples extends Fruits implements IEdible {
    @Override
    public String howToEat(){
        return "Apple could be Juice";
    }
}
