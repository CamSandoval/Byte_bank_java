//As we know that there is no position in our company which is named employee , we could convert Employee into an abstract class
    //It will limit the scope of the class Employee, and it cannot be used to instance new objects,
    // it will only allow to crate instances of its child classes
public abstract class Employee {
    private String name;
    private String document;
    private double salary;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    //As we converted Employee into an abstract, we now know that each of the child classes of Employee should have its own method about bonuses
    public abstract double getBonus();
}
