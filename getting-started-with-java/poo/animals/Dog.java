package animals;

public class Dog extends Animal {

    public Dog(String name, int age, String sound, String breed) {
        super(name, age, sound);
    }

    public void digHole() {
        System.out.println(this.getName() + " is digging a hole");
    }

    public void smellButt(Dog anotherDog) {
        System.out.println(this.getName() + "is smelling " + anotherDog.getName() + " dog's butt");
    }
}
