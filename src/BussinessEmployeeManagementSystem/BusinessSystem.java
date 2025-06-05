package BussinessEmployeeManagementSystem;
import java.util.ArrayList;
import java.util.List;

public class BusinessSystem {
    public static void main(String[] args) { List<Employee> employees = new ArrayList<>();

        employees.add(new Manger(10, "mohamed", 6000, 1000));
        employees.add(new SalesPerson(20, "Ali", 7000, 500));
        employees.add(new Intern( 30 , "khaled", 0));
        employees.add(new Manger(40, " Nourhan ", 86000, 1500));
        employees.add(new SalesPerson(50, " Magdy ", 4500, 700));

        for (Employee employee : employees) {
            employee.displayInfo();

            if (employee instanceof Manger) {
                System.out.println("Manager");

            }
            else if (employee instanceof SalesPerson) {
                System.out.println("Sales Person");
            }
            else if (employee instanceof Intern) {
                System.out.println("Intern");
            }

            System.out.println("Calculated Salary: LE." + employee.calculateSalary());
            System.out.println("****************************");
        }


        System.out.println("Total Employees Number: " + Employee.getEmployeeCount());
        System.out.println("****************************");

    }
}
