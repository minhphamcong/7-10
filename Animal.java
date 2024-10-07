import java.util.ArrayList;
import java.util.List;
public abstract class Animal {
    protected String name;
    public Animal(String name) {
        this.name = name;
    }
    public abstract boolean canSwim();
    public abstract boolean canWalk();

}
class Pig extends Animal {
    public Pig(){
        super("Pig");
    }
    public boolean canSwim() {
        return false;
    }
    public boolean canWalk() {
        return true;
    }
}
class Duck extends Animal {
    public Duck(){
        super("Duck");
    }
    public boolean canSwim() {
        return true;
    }
    public boolean canWalk() {
        return true;
    }
}
class Fish extends Animal {
    public Fish(){
        super("Fish");
    }
    public boolean canSwim() {
        return true;
    }
    public boolean canWalk() {
        return false;
    }
}
class Farm {
    private List<Animal> animals;

    public Farm() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void listSwimmingAnimals() {
        System.out.print("Các động vật có thể bơi: ");
        boolean found = false;
        for (Animal animal : animals) {
            if (animal.canSwim()) {
                System.out.print(animal.name + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.print("Không có");
        }
        System.out.println();
    }

    public void listWalkingAnimals() {
        System.out.print("Các động vật có thể đi bộ: ");
        boolean found = false;
        for (Animal animal : animals) {
            if (animal.canWalk()) {
                System.out.print(animal.name + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.print("Không có");
        }
        System.out.println();
    }
}


