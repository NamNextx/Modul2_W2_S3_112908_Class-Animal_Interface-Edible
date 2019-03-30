package Fruits;
import IEdibles.*;
public class Oranges extends Fruits implements IEdible{
    @Override
    public String howToEat(){
        return "Orange could be Juice";
    }
}
