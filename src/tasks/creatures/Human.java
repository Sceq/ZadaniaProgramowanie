package tasks.creatures;

import tasks.Selleable;
import tasks.devices.Car;

import java.util.Date;

public class Human implements Selleable {
    private Boolean IS_HUMAN = true;
    private static final Double DEFAULT_SALARY = 10000.0;
    Animal pet;


    private Double cash;
    private String firstName;
    private String lastName;
    private Integer age;
    private String owner;
    private Car car;
    private Double salary;


    public Human(Animal pet, String firstName, String lastName, Integer age) {
        this.pet = pet;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = DEFAULT_SALARY;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        {
            if (salary > car.value) {
                System.out.println("Udało się kupić samochód za gotówkę");
            } else if (salary < car.value / 12) {
                System.out.println("Udało się kupić samochód na raty");
            } else {
                System.out.println("brak kaski, idz do szkoly sie poucz i znajdz prace lepiej");
            }
        }
    }

    public Double getSalary() {
        Date Data = new Date();
        System.out.println("Ostatnie pobranie informacji o wypłacie odbyło się " + Data.toString() + " i wynosiła " + this.salary);
        return this.salary;
    }

    public void setSalary() {
        if (salary >= 0) {
            this.salary = salary;
            System.out.println("Nowe dane zostały wysłane do systemu księgowego.");
            System.out.println("Uwaga! Konieczność odebrania aneksu do umowy od pani Hani z kadr!");
            System.out.println("ZUS i US już wiedzą o zmianie wypłaty i nie ma sensu ukrywać dochodu");
        } else {
            System.out.println("Błąd, wypłata nie może być ujemna.");
        }
    }


    public String toStringHuman() {
        return "Human{" +
                "pet=" + pet +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", car=" + car +
                ", salary=" + salary +
                '}';
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (IS_HUMAN = true) {
            System.out.println("To w meksyku, nie tutaj!");
            return;
        }
    }
    public Double getCash() {
        return cash;
    }

    public void setCash(Double cash) {
        this.cash = cash;
    }
}

