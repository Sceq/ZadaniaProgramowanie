package tasks;

import tasks.creatures.Human;

public interface Selleable {
    void sell(Human seller, Human buyer, Double price);
}
