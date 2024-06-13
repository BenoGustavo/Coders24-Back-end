package animals;

public class Cat extends Animal {

    public String furColor;

    public Cat(String name, int age, String sound, String furColor) {
        super(name, age, sound);
        this.furColor = furColor;
    }

    public void takeBath() {
        this.setIsClean(true);
        System.out.println(this.getName() + " cleanned it self");
    }

    public void purr() {
        System.out.println("Purr");
    }
}
