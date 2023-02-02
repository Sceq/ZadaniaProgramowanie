package tasks.creatures;

import tasks.Selleable;

abstract class Animal implements Selleable, Feedable{
    private static final Double DEFAULT_DOG_WEIGHT = 5.0;
    private static final Double DEFAULT_CAT_WEIGHT = 3.0;
    private static Boolean IS_HUMAN = false;
    public Human owner;
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


    public String toStringAnimal() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", isAlive=" + isAlive +
                ", weight=" + weight +
                '}';
    }
    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(seller != this.owner){
            System.out.println("Ktoś tu szykuje scam!");
            return;
        }
        if(buyer.getCash() < price){
            System.out.println("Ktoś tu szykuje scam!");
            return;
        }
        buyer.setCash(buyer.getCash() - price);
        seller.setCash(seller.getCash() + price);
        this.owner = buyer;
        System.out.println("Gratuluje zakupu!");
    }
}
