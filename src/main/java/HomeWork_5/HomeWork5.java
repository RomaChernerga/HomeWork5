package HomeWork_5;


import java.util.Date;
import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.name = "IvanovIvan";
        employee1.post = "Engineer";
        employee1.email = "ivivan@mailbox.com";
        employee1.age = 30;
        employee1.salary = 30000;
        employee1.phone = 892312312;
        employee1.info();  // запрос информации о работнике выше

        System.out.println();

        //Задание 4. Создать массив из 5 сотрудников. Пример Person[] persArray = new Person[5];
        // Вначале объявляем массив объектов persArray[0] = new Person(Ivanov Ivan, Engineer, ivivan@mailbox.com, 892312312, 30000, 30);
        // потом для каждой ячейки массива задаем объект persArray[1] = new Person(...); ... persArray[4] = new Person(...);

        Employee[] employees = {
                new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", 892312312, 30000, 30),
                new Employee("Sergeev Sergey", "Manager", "Sergeev@mail.com", 892563542, 35000, 45),
                new Employee("Petrov Petr", "Engineer", "Petrov@mail.com", 895232587, 35000, 50),
                new Employee("Mihailov Mihail", "Security", "Mihailov@mail.com", 892321452, 35000, 31),
                new Employee("Onegin Oleg", "HR", "Onegin@mail.com", 863547892, 35000, 26),
        };


        // Задание 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                employee.info();
            }
        }
    }
}