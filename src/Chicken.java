public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound(){
        return "Chicken";
    }
    @Override
    public String howToEat(){
        return "Chicken could be Fried";
    }
}
