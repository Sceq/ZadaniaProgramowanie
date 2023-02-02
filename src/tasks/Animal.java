package tasks;

public class Animal {
    private static final Double DEFAULT_DOG_WEIGHT = 5.0;
    private static final Double DEFAULT_CAT_WEIGHT = 3.0;

    String species;
    private Boolean isAlive = true;
    private Double weight;

    public Animal(String species) {
        this.species = species;
        this.isAlive = true;
        if (this.species.equals("canis")) {
            this.weight = DEFAULT_DOG_WEIGHT;
        } else if (this.species.equals("felis")) {
            this.weight = DEFAULT_CAT_WEIGHT;
        }
    }


    public void feed() {
        if (isAlive) {
            weight += 3.0;
            System.out.println("Smakuva");
        } else {
            System.out.println("sad dead");
        }

    }

    public void takeForAWalk() {
        if (isAlive) {
            System.out.println("o smycz, kox");
            weight -= 2;
            if (weight <= 0) {
                isAlive = false;
                System.out.println("nie żyje, zwierzątko nie żyje! <voldemort>");
            }
        } else {
            System.out.println("no sorki, bylo tyle ze mną nie zapier...");
        }

    }
}
