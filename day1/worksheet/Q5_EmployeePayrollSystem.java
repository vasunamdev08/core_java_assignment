package day1.worksheet;
abstract class Employee {
    protected String name;
    protected int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public abstract double calculateSalary(); // Abstract method

    public abstract String getDetails();      // Abstract method
}
class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }

    @Override
    public String getDetails() {
        return "Full-Time Employee: " + name + ", ID: " + id + ", Salary: $" + calculateSalary();
    }
}
class Freelancer extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public Freelancer(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public String getDetails() {
        return "Freelancer: " + name + ", ID: " + id + ", Salary: $" + calculateSalary();
    }
}

public class Q5_EmployeePayrollSystem {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee("Alice", 101, 5000);
        Employee emp2 = new Freelancer("Bob", 102, 50, 80); // $50/hr for 80 hours

        System.out.println(emp1.getDetails());
        System.out.println(emp2.getDetails());
    }
}
