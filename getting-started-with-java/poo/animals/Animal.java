package animals;

public abstract class Animal {
    private String name;
    private int age;
    private final String sound;
    private Boolean isThirst = true;
    private Boolean isHungry = true;
    private Boolean isClean = false;

    public Animal(String name, int age, String sound) {
        this.name = name;
        this.age = age;
        this.sound = sound;
    }

    public void makeSound() {
        System.out.println(this.sound);
    }

    public void eat() {
        this.isHungry = false;
    }

    public void drink() {
        this.isThirst = false;
    }

    public void sleep() {
        this.isHungry = true;
        this.isThirst = true;
    }

    public int getAge() {
        return age;
    }

    public String getSound() {
        return sound;
    }

    public Boolean getIsHungry() {
        return isHungry;
    }

    public Boolean getIsThirst() {
        return isThirst;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setIsClean(boolean state) {
        this.isClean = state;
    }

    public void play() {
        this.setIsClean(false);
        System.out.println(this.name + " is playing and now he is dirty.");
    }

    public Boolean getIsClean() {
        return isClean;
    }

    public void setName(String name) {
        this.name = name;
    }
}
