import java.util.Arrays;

public class Employee {
    //    1. Создать класс Employee, который содержит информацию о Ф.И.О., отделе и зарплате сотрудника. Отделы для простоты должны быть названы от 1 до 5.
//    2. Добавить статическую переменную-счетчик, которая будет отвечать за id.
//    3. Добавить в класс Employee поле id, которое проставляется из счетчика, а затем счетчик увеличивает свое значение.
//    4. Добавить возможность получать значения полей из Employee (геттеры) для всех полей.
//    5. Добавить возможность устанавливать значения полей отдела и зарплаты (сеттеры).
//    6. По умолчанию все поля должны передавать через конструктор (кроме id) и заполняться в нем (включая id, который нужно получить из счетчика).
//    7. Создать внутри класса с методом main поле типа Employee[10], которое будет выполнять роль «хранилища» для записей о сотрудниках.
//    8. Создать статические методы, которые будут взаимодействовать с массивом и предоставлять результат:
//        1. Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).
//        2. Посчитать сумму затрат на зарплаты в месяц.
//        3. Найти сотрудника с минимальной зарплатой.
//        4. Найти сотрудника с максимальной зарплатой.
//        5. Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта 8.2).
//        6. Получить Ф. И. О. всех сотрудников (вывести в консоль).

    //- **Повышенная сложность**
    //    Создать дополнительные статические методы для решения следующих задач.
    //    1. Проиндексировать зарплату (вызвать изменение зарплат у всех сотрудников на величину аргумента в %).
    //    2. Получить в качестве параметра номер отдела (1–5) и найти (всего 6 методов):
    //        1. Сотрудника с минимальной зарплатой.
    //        2. Сотрудника с максимальной зарплатой.
    //        3. Сумму затрат на зарплату по отделу.
    //        4. Среднюю зарплату по отделу (учесть, что количество людей в отделе отличается от employees.length).
    //        5. Проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра.
    //        6. Напечатать всех сотрудников отдела (все данные, кроме отдела).
    //    3. Получить в качестве параметра число и найти:
    //        1. Всех сотрудников с зарплатой меньше числа (вывести id, Ф. И. О. и зарплатой в консоль).
    //        2. Всех сотрудников с зарплатой больше (или равно) числа (вывести id, Ф. И. О. и зарплатой в консоль).
    private static int counter;
    private final int id;
    private final String fio;
    private int department;
    private int salary;

    public Employee(String fio, int department, int salary) {
        this.fio = fio;
        this.department = department;
        this.salary = salary;
        this.id = counter;
        counter++;
    }

    @Override
    public String toString() {
        return ("id: " + id + ", ФИО: " + fio + ", Отдел: " + department + ", З/П: " + salary);
    }

    public String toStringDept() {
        return ("id: " + id + ", ФИО: " + fio + ", З/П: " + salary);
    }

    public static void printAllEmployees(Employee[] employeesList) {
        for (int i = 0; i < employeesList.length; i++) {
            System.out.println(employeesList[i]);
        }
    }

    public static int salarySummPerMonth(Employee[] employeesList) {
        int summ = 0;
        for (int i = 0; i < employeesList.length; i++) {
            summ += employeesList[i].salary;
        }
        return summ;
    }

    public static void minSalary(Employee[] employeesList) {
        int min = employeesList[0].salary;
        for (int i = 1; i < employeesList.length; i++) {
            if (employeesList[i].salary <= min) {
                min = employeesList[i].salary;
            }
        }
        for (int i = 0; i < employeesList.length; i++) {
            if (min == employeesList[i].salary) {
                System.out.println("Минимальная ЗП: " + employeesList[i]);
            }
        }
    }

    public static void maxSalary(Employee[] employeesList) {
        int max = employeesList[0].salary;
        for (int i = 1; i < employeesList.length; i++) {
            if (employeesList[i].salary >= max) {
                max = employeesList[i].salary;
            }
        }
        for (int i = 0; i < employeesList.length; i++) {
            if (max == employeesList[i].salary) {
                System.out.println("Максимальная ЗП: " + employeesList[i]);
            }
        }
    }

    public static int averageSalary(Employee[] employeesList) {
        return (salarySummPerMonth(employeesList) / employeesList.length);
    }

    public static void printAllEmployeesFIO(Employee[] employeesList) {
        for (int i = 0; i < employeesList.length; i++) {
            System.out.println(employeesList[i].fio);
        }
    }

    //**Повышенная сложность**
    public static Employee[] increaseSalaryByPercent(Employee[] employeesList, int percent) {
        float coefficient = ((percent / 100f) + 1f);      //получаем коэффициент пересчёта процентов
        for (int i = 0; i < employeesList.length; i++) {
            employeesList[i].salary = (int) (employeesList[i].salary * (coefficient));
        }
        return employeesList;
    }

    private static Employee[] deptExtract(Employee[] employeesList, int deptId) {
        Employee[] employeesByDept = new Employee[1];
        int j = 0;
        for (int i = 0; i < employeesList.length; i++) {
            if (employeesList[i].department == deptId) {
                employeesByDept[j] = employeesList[i];
                j++;
                employeesByDept = Arrays.copyOf(employeesByDept, employeesByDept.length + 1);
            }
        }
        employeesByDept = Arrays.copyOf(employeesByDept, employeesByDept.length - 1); //по другому не придумал, только такой костыль получился
        return employeesByDept;
    }

    public static void minSalaryEmployeeInDept(Employee[] employeesList, int deptId) {
        System.out.print("По отделу " + deptId + " ");
        minSalary(deptExtract(employeesList, deptId));
    }

    public static void maxSalaryEmployeeInDept(Employee[] employeesList, int deptId) {
        System.out.print("По отделу " + deptId + " ");
        maxSalary(deptExtract(employeesList, deptId));
    }

    public static void monthSalaryInDept(Employee[] employeesList, int deptId) {
        System.out.println("Сумму затрат на зарплату по отделу № " + deptId + " равна " + salarySummPerMonth(deptExtract(employeesList, deptId)));
    }

    public static void averageSalaryInDept(Employee[] employeesList, int deptId) {
        System.out.println("Средняя зарплата по отделу № " + deptId + " равна " + averageSalary(deptExtract(employeesList, deptId)));
    }

    public static Employee[] increaseSalaryByPercentInDept(Employee[] employeesList, int deptId, int percent) {
        return increaseSalaryByPercent(deptExtract(employeesList, deptId), percent);
    }

    public static void printAllInDept(Employee[] employeesList, int deptId) {
        Employee[] deptEmployee = deptExtract(employeesList, deptId);
        for (int i = 0; i < deptEmployee.length; i++) {
            System.out.println(deptEmployee[i].toStringDept());
        }
    }

    public static void printAllLowerThanThis(Employee[] employeesList, int edge) {
        for (int i = 0; i < employeesList.length; i++) {
            if (employeesList[i].salary < edge)
                System.out.println("id: " + employeesList[i].id + ", ФИО: " + employeesList[i].fio + ", З/П: " + employeesList[i].salary);
        }
    }
    public static void printAllUpperThanThis(Employee[] employeesList, int edge) {
        for (int i = 0; i < employeesList.length; i++) {
            if (employeesList[i].salary >= edge)
                System.out.println("id: " + employeesList[i].id + ", ФИО: " + employeesList[i].fio + ", З/П: " + employeesList[i].salary);
        }
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
