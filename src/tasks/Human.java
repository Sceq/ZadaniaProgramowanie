package tasks;

public class Human {
    Animal pet;
    private String firstName;
    private String lastName;
    private Integer age;




    public Human(Animal pet, String firstName, String lastName, Integer age) {
        this.pet = pet;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    private Car car;
}
