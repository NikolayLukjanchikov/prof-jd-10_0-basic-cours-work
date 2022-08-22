import java.util.Arrays;

public class Employee {

    private static int counter;
    private final int id;
    private final String fio;
    private int department;
    private int salary;

    public Employee(String fio, int department, int salary) {
        this.fio = fio;
        this.department = department;
        this.salary = salary;
        this.id = ++counter;
    }

    @Override
    public String toString() {
        return ("id: " + id + ", ФИО: " + fio + ", Отдел: " + department + ", З/П: " + salary);
    }

    public String toStringDept() {
        return ("id: " + id + ", ФИО: " + fio + ", З/П: " + salary);
    }


    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public String getFio() {
        return fio;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
