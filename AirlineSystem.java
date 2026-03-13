abstract class Person {
    protected String name;
    protected String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public abstract void displayRole();
}
class Customer extends Person {

    private String frequentFlyerNumber;

    public Customer(String name, String email, String ffNumber) {
        super(name, email);
        this.frequentFlyerNumber = ffNumber;
    }

    @Override
    public void displayRole() {
        System.out.println(name + " is a Customer with FF number: " + frequentFlyerNumber);
    }
}
class Pilot extends Person {

    private String licenseNumber;

    public Pilot(String name, String email, String licenseNumber) {
        super(name, email);
        this.licenseNumber = licenseNumber;
    }

    @Override
    public void displayRole() {
        System.out.println(name + " is a Pilot with license: " + licenseNumber);
    }
}
class Crew extends Person {

    private String role;

    public Crew(String name, String email, String role) {
        super(name, email);
        this.role = role;
    }

    @Override
    public void displayRole() {
        System.out.println(name + " works as Crew: " + role);
    }
}
public class AirlineSystem {

    public static void main(String[] args) {

        Person p1 = new Customer("Ali", "ali@mail.com", "FF123");
        Person p2 = new Pilot("John", "john@mail.com", "LIC456");
        Person p3 = new Crew("Anna", "anna@mail.com", "Flight Attendant");

        p1.displayRole();
        p2.displayRole();
        p3.displayRole();
    }
}