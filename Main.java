import java.util.Scanner;

class Member {
    String name;
    int age;
    String phone;
    String address;
    double salary;

    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {
    String specialization;
}

class Manager extends Member {
    String department;
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter employee information:");
        Employee employee = new Employee();
        System.out.print("Name: ");
        employee.name = scanner.nextLine();
        System.out.print("Age: ");
        employee.age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Phone: ");
        employee.phone = scanner.nextLine();
        System.out.print("Address: ");
        employee.address = scanner.nextLine();
        System.out.print("Salary: ");
        employee.salary = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Specialization: ");
        employee.specialization = scanner.nextLine();

        System.out.println("\nEnter manager information:");
        Manager manager = new Manager();
        System.out.print("Name: ");
        manager.name = scanner.nextLine();
        System.out.print("Age: ");
        manager.age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Phone: ");
        manager.phone = scanner.nextLine();
        System.out.print("Address: ");
        manager.address = scanner.nextLine();
        System.out.print("Salary: ");
        manager.salary = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Department: ");
        manager.department = scanner.nextLine();

        System.out.println("\nEmployee information:");
        System.out.println("Name: " + employee.name);
        System.out.println("Age: " + employee.age);
        System.out.println("Phone: " + employee.phone);
        System.out.println("Address: " + employee.address);
        employee.printSalary();
        System.out.println("Specialization: " + employee.specialization);

        System.out.println("\nManager information:");
        System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Phone: " + manager.phone);
        System.out.println("Address: " + manager.address);
        manager.printSalary();
        System.out.println("Department: " + manager.department);

        scanner.close();
    }
}
