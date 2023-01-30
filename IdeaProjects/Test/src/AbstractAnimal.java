import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class AbstractAnimal implements Walkable {
    public void eat() {
        System.out.println("Eat");
    }

    abstract void makeSound();
}

abstract class AbstractFourLegAnimal extends AbstractAnimal {
    public abstract void runOnFourLegs();
}

class Dog extends AbstractFourLegAnimal {

    @Override
    public void makeSound() {
        System.out.println("Barks");
    }

    @Override
    public void runOnFourLegs() {
        System.out.println("runs on 4 legs");
    }

    @Override
    public void walks() {
        System.out.println("Walks");
    }

    public void makeDogPet() {
        System.out.println("now a pet");
    }

}

class AnimalRunner {
    public static void main(String[] args) {
        Dog alex = new Dog();
        alex.makeDogPet();
        alex.makeSound();
        alex.runOnFourLegs();
        alex.eat();
        alex.walks();
        alex.crawls();

        AbstractFourLegAnimal jerry = new Dog();
        jerry.runOnFourLegs();
        jerry.makeSound();
        jerry.eat();
        jerry.walks();
        jerry.crawls();

        AbstractAnimal goofy = new Dog();
        goofy.eat();
        goofy.walks();
        goofy.makeSound();
        goofy.crawls();

        Walkable tommy = new Dog();
        tommy.crawls();
        tommy.walks();
        System.out.println(tommy.getClass());//dog class, reference type - walkable

        Walkable tommyCast = new Dog();
        ((Dog)tommyCast).makeDogPet();


    }
}

interface Walkable {
    void walks();

    default void crawls() {
        System.out.println("crawls");
    }
}
