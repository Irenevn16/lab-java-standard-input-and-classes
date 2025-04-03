public class Intern extends Employee {
    private static final double MAX_SALARY = 20000; //salario máx para intern

    public Intern (String name, String email, int age, double salary) {
        super(name, email, age, Math.min(salary, MAX_SALARY));//para que el salario no se pase del max
    }

    @Override //a getSalary para que el salario no supere el max
    public void setSalary(double salary) {
        if (salary > MAX_SALARY) {
            System.out.println("Error: el salario no puede superar " + MAX_SALARY);
        } else {
            super.setSalary(salary);
        }
    }
}
