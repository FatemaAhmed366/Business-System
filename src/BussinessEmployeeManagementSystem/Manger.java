package BussinessEmployeeManagementSystem;

public class Manger extends Employee {
    private double bonuse;

    public Manger (int id,String name ,double baseSalary , double bonuse){
        super(id,name,baseSalary);
        this.bonuse=bonuse;
    }

    public double getBonuse() {
        return bonuse;
    }

    public void setBonuse(double bonuse) {
        this.bonuse = bonuse;
    }
    @Override
    public double calculateSalary(){
       return  getBaseSalary()+bonuse;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Bonuse:" + bonuse);
    }

}
