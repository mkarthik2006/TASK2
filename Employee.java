public class Employee extends Persons{
    int employeeID;
    double salary;

    public Employee(String name, int age, int employeeID, double salary) {
        super(name, age); // Call the superclass constructor to initialize name and age
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public void displayEmployeeInfo() {
        super.displayInfo(); // Call the displayInfo method of the superclass
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: " + salary);
    }


}