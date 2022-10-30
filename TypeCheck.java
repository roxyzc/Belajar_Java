class Employee {
    public String name = "Tidak ada";
}

class Manager extends Employee {
    public String name = "Manager";
}

public class TypeCheck {
    public static void main(String[] args) {
        Employee employee = new Manager();
        sayHello(employee);
    }

    static void sayHello(Employee employee) {
        if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.print(manager.name);
        } else {
            System.out.print(employee.name);
        }

    }
}
