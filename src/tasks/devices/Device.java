package tasks.devices;

abstract class Device {

    String model;
    String producer;

    public Device(String model, String producer) {
        this.model = model;
        this.producer = producer;
    }

    public String toStringDevice() {
        return "Model: " + this.model + "Producent: " + this.producer;
    }
    public abstract void turnOn();

}
