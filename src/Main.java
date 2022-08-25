public class Main {
    public static void main(String[] args) {
//Напишите программу, которая занимается учетом сотрудников и помогает кадрам и бухгалтерии автоматизировать процессы.
//С помощью вашей программы бухгалтерия и отдел кадров смогут узнавать следующую информацию:
//1. Получить список всех сотрудников.
//2. Посчитать сумму затрат на зарплаты.
//3. Найти сотрудника с минимальной заплатой.
//4. Найти сотрудника с максимальной зарплатой.
//5. Подсчитать среднее значение зарплат.

//- **Базовая сложность**
//    1. Создать класс Employee, который содержит информацию о Ф.И.О., отделе и зарплате сотрудника. Отделы для простоты должны быть названы от 1 до 5.
//    2. Добавить статическую переменную-счетчик, которая будет отвечать за id.
//    3. Добавить в класс Employee поле id, которое проставляется из счетчика, а затем счетчик увеличивает свое значение.
//    4. Добавить возможность получать значения полей из Employee (геттеры) для всех полей.
//    5. Добавить возможность устанавливать значения полей отдела и зарплаты (сеттеры).
//    6. По умолчанию все поля должны передавать через конструктор (кроме id) и заполняться в нем (включая id, который нужно получить из счетчика).
//    7. Создать внутри класса с методом main поле типа Employee[10], которое будет выполнять роль «хранилища» для записей о сотрудниках.
//    8. Создать статические методы, которые будут взаимодействовать с массивом и предоставлять результат:
//        1. +Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).
//        2. +Посчитать сумму затрат на зарплаты в месяц.
//        3. +Найти сотрудника с минимальной зарплатой.
//        4. +Найти сотрудника с максимальной зарплатой.
//        5. +Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта 8.2).
//        6. +Получить Ф. И. О. всех сотрудников (вывести в консоль).

        //- **Повышенная сложность**
        //    Создать дополнительные статические методы для решения следующих задач.
        //
        //    1. +Проиндексировать зарплату (вызвать изменение зарплат у всех сотрудников на величину аргумента в %).
        //    2. Получить в качестве параметра номер отдела (1–5) и найти (всего 6 методов):
        //        +1. Сотрудника с минимальной зарплатой.
        //        +2. Сотрудника с максимальной зарплатой.
        //        +3. Сумму затрат на зарплату по отделу.
        //        +4. Среднюю зарплату по отделу (учесть, что количество людей в отделе отличается от employees.length).
        //        +5. Проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра.
        //        +6. Напечатать всех сотрудников отдела (все данные, кроме отдела).
        //    3. Получить в качестве параметра число и найти:
        //        +1. Всех сотрудников с зарплатой меньше числа (вывести id, Ф. И. О. и зарплатой в консоль).
        //        +2. Всех сотрудников с зарплатой больше (или равно) числа (вывести id, Ф. И. О. и зарплатой в консоль).

        //- **Очень сложно**
        //    Привести структуру проекта к ООП.
        //    1. +Создать класс EmployeeBook.
        //    2. +Перенести хранилище сотрудников в него (массив), закрыть к нему доступ извне (сделать приватным).
        //    3. +Все статические методы по работе с массивом перенести в этот класс и сделать нестатическими.
        //    4. +Добавить несколько новых методов:
        //        1. Добавить нового сотрудника (создаем объект, заполняем поля, кладем в массив).
        //        Нужно найти свободную ячейку в массиве и добавить нового сотрудника в нее. Искать нужно всегда с начала, так как возможно добавление в ячейку удаленных ранее сотрудников.
        //        2. Удалить сотрудника (находим сотрудника по Ф. И. О. и/или id, обнуляем его ячейку в массиве).
        //    5. +Изменить сотрудника (получить сотрудника по Ф. И. О., модернизировать его запись):
        //        1. Изменить зарплату.
        //        2. Изменить отдел.
        //        Придумать архитектуру. Сделать или два метода, или один, но продумать его.
        //    6. +Получить Ф. И. О. всех сотрудников по отделам (напечатать список отделов и их сотрудников).

        System.out.println("Базовая сложность");

        EmployeeBook employeeBook = new EmployeeBook();

       // employeeBook.getEmployees()[0] = new Employee("Первый Сотрудник Сотрудниковый", 5, 100000);
        employeeBook.getEmployees()[1] = new Employee("Второй Сотрудник Сотрудниковый", 1, 111);
        employeeBook.getEmployees()[2] = new Employee("Третий Сотрудник Сотрудниковый", 2, 300000);
        employeeBook.getEmployees()[3] = new Employee("Четвёртый Сотрудник Сотрудниковый", 2, 50000);
        employeeBook.getEmployees()[4] = new Employee("Пятый Сотрудник Сотрудниковый", 4, 150000);
        employeeBook.getEmployees()[5] = new Employee("Шестой Сотрудник Сотрудниковый", 2, 120000);
        employeeBook.getEmployees()[6] = new Employee("Седьмой Сотрудник Сотрудниковый", 3, 170000);
        employeeBook.getEmployees()[8] = new Employee("Девятый Сотрудник Сотрудниковый", 2, 99999999);
        employeeBook.getEmployees()[9] = new Employee("Десятый Сотрудник Сотрудниковый", 5, 50000);


        employeeBook.printAllEmployees(employeeBook.getEmployees());
        System.out.println();
        System.out.println("Сумма затрат на зарплаты в месяц: " + employeeBook.getSalarySumPerMonth(employeeBook.getEmployees()));
        System.out.println();
        employeeBook.printAllEmployeesWithMinSalary(employeeBook.getEmployees());
        System.out.println();
        employeeBook.printAllEmployeesWithMaxSalary(employeeBook.getEmployees());
        System.out.println();
        System.out.println("Средняя ЗП за месяц: " + employeeBook.getAverageSalary(employeeBook.getEmployees()));
        System.out.println();
        employeeBook.printAllEmployeesFullName(employeeBook.getEmployees());
        System.out.println();
        employeeBook.setIncreaseSalaryByPercentToAllEmployees(employeeBook.getEmployees(), 10);
        employeeBook.printAllEmployees(employeeBook.getEmployees());
        System.out.println();
        employeeBook.printEmployeeWithMinSalaryInDept(employeeBook.getEmployees(), 2);
        System.out.println();
        employeeBook.printEmployeeWithMaxSalaryInDept(employeeBook.getEmployees(), 2);
        System.out.println();
        employeeBook.printMonthSalaryInDept(employeeBook.getEmployees(), 2);
        System.out.println();
        employeeBook.printAverageSalaryInDept(employeeBook.getEmployees(), 2);
        System.out.println();
        employeeBook.setIncreaseSalaryByPercentInDept(employeeBook.getEmployees(), 2, 30);
        employeeBook.printAllEmployeesInDept(employeeBook.getEmployees(), 2);
        System.out.println();
        employeeBook.printAllEmployeesSalaryLowerThanThis(employeeBook.getEmployees(), 120000);
        System.out.println();
        employeeBook.printAllEmployeesSalaryUpperThanThis(employeeBook.getEmployees(), 200000);
        System.out.println();
        employeeBook.addNewEmployee(new Employee("Первый Сотрудник Сотрудниковый", 5, 50000));
        employeeBook.printAllEmployees(employeeBook.getEmployees());
        System.out.println("Удаляем");
        employeeBook.deleteEmployee("Первый Сотрудник Сотрудниковый", 9);
        employeeBook.printAllEmployees(employeeBook.getEmployees());
        System.out.println();
        employeeBook.changeEmployeeSpecs("Первый Сотрудник Сотрудниковый",102,888);
        employeeBook.printAllEmployees(employeeBook.getEmployees());
        System.out.println();
        employeeBook.printAllEmployeesByDepartments(employeeBook.getEmployees());
    }
}