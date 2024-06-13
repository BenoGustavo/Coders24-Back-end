import animals.Cat;
import animals.Dog;
import petshop.Petshop;

public class Main {

    public static void main(String[] args) {
        Cat animalOne = new Cat("gatinho", 2, "meow", "orange");

        Dog animalThree = new Dog("doguinho", 4, "woof", "labrador");

        Petshop petshopOne = new Petshop("Petshop da esquina");

        petshopOne.doBath(animalOne);

        petshopOne.open();
        petshopOne.doBath(animalOne);

        animalOne.play();
        petshopOne.doBath(animalOne);

        animalOne.takeBath();

        petshopOne.doBath(animalThree);
    }
}