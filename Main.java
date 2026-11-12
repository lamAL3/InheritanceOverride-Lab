import java.util.Scanner;

class Employee {
    double salary = 0.0;
    double calculateSalary(){
        return salary;
    }
}
class FullTimeEmployee extends Employee{
    double basePay;
    double bonus;
    @Override
    double calculateSalary(){
        return basePay+bonus;
    }
}
class PartTimeEmployee extends Employee{
    double hourlyRate;
    double hoursWorked;
    @Override
    double calculateSalary(){
        return hourlyRate*hoursWorked;
    }
}
public class Main {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee type (full-time / part-time): ");
        String employeeType = input.nextLine();
        if(employeeType.equalsIgnoreCase("full-time")){
            FullTimeEmployee employee1 = new FullTimeEmployee();
            System.out.print("Enter basepay: ");
            employee1.basePay = input.nextDouble();
            System.out.print("Enter bonus: ");
            employee1.bonus = input.nextDouble();
            System.out.println("Monthly salary: $"+employee1.calculateSalary());
        }

        if(employeeType.equalsIgnoreCase("part-time")){
            PartTimeEmployee employee1 = new PartTimeEmployee();
            System.out.print("Enter hourly rate: ");
            employee1.hourlyRate = input.nextDouble();
            System.out.print("Enter hours worked: ");
            employee1.hoursWorked = input.nextDouble();
            System.out.println("Monthly salary: $"+employee1.calculateSalary());
        }
        else {
            System.out.println("Please enter (full-time/part-time)");
        }
    }
}