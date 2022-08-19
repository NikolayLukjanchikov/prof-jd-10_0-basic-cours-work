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
        return ("id: " + id + ", ФИО: " + fio + ", Департамент: " + department + ", З/П: " + salary);
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
