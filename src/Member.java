import java.util.Scanner;

class Member {
    public String Name;
    public int age;
    public float Phone_number;
    public String Address;
    public double Salary;
    public void printSalary(){
        System.out.println("Salary of "+Name+ " : $" + Salary);
    }
}
class Employee extends Member {
    String specialization;
    String department;

    Employee(String specialization, String department) {
        this.specialization = specialization;
        this.department = department;
    }
}
class Manager extends Member {
    String specialization;
    String department;

    Manager(String specialization, String department) {
        this.specialization = specialization;
        this.department = department;
    }
}
class Test{
    public static void main(String[] args) {
        Employee emp = new Employee("Batsman","ICT");
        emp.Name = "Virat Kohli";
        emp.age = 33;
        emp.Address = "New Delhi";
        emp.Phone_number = 9876534210f;
        emp.Salary = 1_000_000;
        emp.printSalary();
        Manager mng = new Manager("Coach","ICT");
        mng.Name = "Robi seshtri";
        mng.age = 70;
        mng.Address = "NO clue";
        mng.Phone_number = 4442224442f;
        mng.Salary = 1_00_000;
        mng.printSalary();
    }
}