// Create an abstract class `Employee` with an abstract method `calculateSalary()`. Implement subclasses `FullTimeEmployee` and `PartTimeEmployee` with different salary calculation logic.

abstract class Employee {
    abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {
    double salary;
    double bonus;

    FullTimeEmployee(double salary, double bonus) {
        this.salary = salary;
        this.bonus = bonus;
    }

    public double calculateSalary() {
        return salary + bonus;
    }
}

class PartTimeEmployee extends Employee {
    int hoursWorked;
    double ratePerHour;

    PartTimeEmployee(int hoursWorked, double ratePerHour) {
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public double calculateSalary() {
        return ratePerHour * hoursWorked;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e;

        e = new FullTimeEmployee(45000.45, 1500);
        System.out.println("Salary Of Full Time Employee: " + e.calculateSalary());

        e = new PartTimeEmployee(6, 450.50);
        System.out.println("Salary Of Part Time Employee: " + e.calculateSalary());
    }
}
