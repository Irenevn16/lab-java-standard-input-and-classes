import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;


public class EmployeesFactory {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        //creación de 10 empleados-empoyee objets
        employees.add(new Employee("Ana", "ana@gmail.com", 58, 50000));
        employees.add(new Employee("Pedro", "pedro@gmail.com", 21, 22100));
        employees.add(new Employee("Julia", "julia@gmail.com", 36, 62500));
        employees.add(new Employee("Ester", "ester@gmail.com", 28, 29000));
        employees.add(new Employee("Alberto", "alberto@gmail.com", 41, 48000));
        employees.add(new Employee("Paola", "paola@gmail.com", 64, 32400));
        employees.add(new Employee("Tomas", "tomas@gmail.com", 39, 42000));
        employees.add(new Employee("Angel", "angel@gmail.com", 34, 41800));
        employees.add(new Employee("Mercedes", "mercedes@gmail.com", 26, 19500));
        employees.add(new Employee("Pepe", "pepe@gmail.com", 47, 50000));

        try (FileWriter writer = new FileWriter("employees.txt")) {
            for (Employee emp : employees) {
                writer.write(emp.toString() + "\n");
            }
            System.out.println("Los datos de los empleados han sido guardados en employees.txt");
        } catch (IOException e) {
            System.out.println("Error");
        }
        }
    }

