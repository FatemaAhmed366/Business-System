package BussinessEmployeeManagementSystem;

public abstract class Employee {
    private  int id;
    private  String name;
    private  double baseSalary;

    private static int employeeCount = 0;

    public static int getEmployeeCount() {
        return employeeCount;
    }

    public static void setEmployeeCount(int employeeCount) {
        Employee.employeeCount = employeeCount;
    }

    public Employee(int id, String name , double baseSalary)
    {
      this.id=id;

      this.name=name;

      this.baseSalary=baseSalary;

      employeeCount ++;
   }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();


    public void displayInfo (){
        System.out.println("Id:" + id);
        System.out.println("Name:" + name);

    }



}