public class FarmManagement {
    public static void main(String[] args) {
        Animal pig = new Pig();
        Animal duck = new Duck();
        Animal fish = new Fish();

        Farm farm = new Farm();
        farm.addAnimal(pig);
        farm.addAnimal(duck);
        farm.addAnimal(fish);

        farm.listSwimmingAnimals();
        farm.listWalkingAnimals();
    }
}
