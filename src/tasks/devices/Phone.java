package tasks.devices;

public class Phone extends Device{
    private final String colour;
    public Double value;


    public Phone(String model, String producer, String colour, Double value) {
        super(model, producer);
        this.colour = colour;
        this.value = value;

    }

    @Override
    public void turnOn() {
        System.out.println("Witaj użytkowniku iphona 15000 PRO ULTRA");
    }
}
