package petshop;

import animals.Animal;
import animals.Cat;

public class Petshop {
    private boolean isOpen;
    private final String name;

    public Petshop(String name) {
        this.name = name;
        this.isOpen = false;
    }

    public Petshop(String name, boolean isOpen) {
        this.name = name;
        this.isOpen = isOpen;
    }

    public void open() {
        if (this.isOpen) {
            System.out.println(this.name + " is already open");
            return;
        }

        this.isOpen = true;
        System.out.println(this.name + " is now open");
    }

    public void close() {
        if (!this.isOpen) {
            System.out.println(this.name + " is already closed");
            return;
        }

        this.isOpen = false;
        System.out.println(this.name + " is now closed");
    }

    public void doBath(Animal animal) {
        if (!this.isOpen) {
            System.out.println(this.name + " is closed");
            return;
        }

        if (animal.getIsClean()) {
            System.out.println(animal.getName() + " is already clean");
            return;
        }

        if (animal instanceof Cat) {
            System.out.println(animal.getName() + " is a cat and don't want to be cleanned by someone else");
            return;
        }

        animal.setIsClean(true);
        System.out.println(animal.getName() + " is now clean");
    }

    public boolean getIsOpen() {
        return this.isOpen;
    }
}
