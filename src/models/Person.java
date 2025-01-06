package models;

public abstract class Person implements Payable, Comparable<Person> {
    private static int counter = 1;
    private final int id;
    private String name;
    private String surname;

    public Person() {
        this.id = counter++;
        this.name = "Default";
        this.surname = "Default";
    }

    public Person(String name, String surname) {
        this.id = counter++;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String toString() {
        return id + ". " + name + " " + surname;
    }

    public abstract String getPosition();

    @Override
    public int compareTo(Person other) {
        return Double.compare(other.getPaymentAmount(), this.getPaymentAmount());
    }



}
