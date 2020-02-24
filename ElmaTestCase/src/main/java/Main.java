import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Platform platform = new Platform();
        ArrayList<Employee> employees = new ArrayList<>();
        //создаем сотрудников компании
        employees.add(new Employee("Max", "Manager"));
        employees.add(new Employee("Jack", "Analyst"));
        employees.add(new Employee("Rick", "Sales manager"));
        employees.add(new Employee("Tim", "Developer"));
        employees.add(new Employee("Kim", "Developer"));
        employees.add(new Employee("John", "Developer"));
        employees.add(new Employee("Jerry", "Developer"));
        employees.add(new Employee("Tom", "Developer"));
        employees.add(new Employee("Lucy", "Developer"));
        employees.add(new Employee("Ann", "Developer"));
        employees.add(new Employee("Tony", "Developer"));

        platform.sendEmployee(employees.get(0), "Moscow", 2020, 2, 12, 1, 1);
        platform.returnEmployee(employees.get(0), 2020, 2, 14, 1, 1);

        platform.printRecapByEmployee(employees.get(0));


    }
}
