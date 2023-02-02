package tasks.devices;

public class Car {

    private final String model;
    private final String producer;
    private final String colour;
    public Double value;


    public Car(String model, String producer, String colour, Double value) {
        this.model = model;
        this.producer = producer;
        this.colour = colour;
        this.value = value;

    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", colour='" + colour + '\'' +
                ", value=" + value +
                '}';
    }
}
