package HomeWork_5;


public class Employee {

     String name;   //имя
     String post;   //должность
     String email;  //электрон.адрес
     int phone;  //телефон
     int salary;    //оклад
     int age;       //возраст

    // Задание 2. Конструктор класса должен заполнять эти поля при создании объекта.

    Employee(String name, String post, String email, int phone, int salary, int age) {  //конструктор
        this.name = name;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

    }
    public Employee() {

    }


    // Залание 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
    void info(){
        System.out. print("Имя работника: " + name
                + "\nдолжность работника: " + post
                + "\nэлектронный адрес: " + email
                + "\nрабочий телефон: " + phone
                + "\nоклад: " + salary
                + "\nвозраст " + age);
        System.out. println();
    }

    public int getAge() {
        return this.age;
    }
}
