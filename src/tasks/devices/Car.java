package tasks.devices;

public class Car extends  Device{
    private final String colour;
    public Double value;


    public Car(String model, String producer, String colour, Double value) {
        super(model, producer);
        this.colour = colour;
        this.value = value;

    }


    public String toStringCar() {
        return "Car{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", colour='" + colour + '\'' +
                ", value=" + value +
                '}';
    }

    @Override
    public void turnOn() {
        System.out.println("start brumbruma.");

    }
}
