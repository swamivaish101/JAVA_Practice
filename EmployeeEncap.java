import java.util.*;

public class EmployeeEncap {
    
    private int employee_id;
    private String employee_name;
    private double employee_salary;

    
    public int getEmployeeId() {
        return employee_id;
    }

    
    public void setEmployeeId(int id) {
        employee_id = id;
    }

    
    public String getEmployeeName() {
        return employee_name;
    }

    
    public void setEmployeeName(String name) {
        employee_name = name;
    }

    
    public double getEmployeeSalary() {
        return employee_salary;
    }

    
    public void setEmployeeSalary(double salary) {
        employee_salary = salary;
    }

    
    public String displayEmployeeDetails() {
        return "Employee ID: " + employee_id + "\nEmployee Name: " + employee_name + "\nEmployee Salary: $" + employee_salary;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        EmployeeEncap employee = new EmployeeEncap();

        
        System.out.print("Enter Employee ID: ");
        int id = input.nextInt();
        employee.setEmployeeId(id);

        input.nextLine(); 
        System.out.print("Enter Employee Name: ");
        String name = input.nextLine();
        employee.setEmployeeName(name);

        System.out.print("Enter Employee Salary: $");
        double salary = input.nextDouble();
        employee.setEmployeeSalary(salary);

    
        System.out.println("\nEmployee Details:");
        System.out.println(employee.displayEmployeeDetails());
    }
}
