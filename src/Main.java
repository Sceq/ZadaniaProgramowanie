import tasks.Animal;
import tasks.Car;
import tasks.Human;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nZadanie 1\n");
        Animal doggo = new Animal("canis");

        doggo.feed();
        doggo.takeForAWalk();
        doggo.takeForAWalk();
        doggo.takeForAWalk();
        doggo.takeForAWalk();
        doggo.takeForAWalk();
        doggo.takeForAWalk();
        doggo.takeForAWalk();
        doggo.feed();
        System.out.println("\nZadanie 2\n");
        Human czlek = new Human(doggo, "Filip", "Kaniecki", 22);
        Car samochod = new Car("A150", "Audi", "czerwono-zielonawo-niebieskie");
        czlek.setCar(samochod);

    }
}