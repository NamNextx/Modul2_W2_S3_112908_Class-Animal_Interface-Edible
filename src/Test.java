import Animal.*;
import IEdibles.*;
public class Test {
    public static void main(String[] args) {

        Animals[] animals = new Animals[2];
        animals[0] = new Tigers();
        animals[1] = new Chickens();
        for (Animals animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chickens) {
                IEdible edibler = (Chickens) animal;
                System.out.println(edibler.howToEat());
            }
            else if (animal instanceof Tigers){
                IEdible edible=(Tigers) animal;
                System.out.println(edible.howToEat());
            }
        }
    }
}
