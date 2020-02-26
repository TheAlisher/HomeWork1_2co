package com.company;

public class OfficePlankton {

    private String name;
    private int age;
    private Occupation occupation;
    private Salary salary;
    private int phoneNumbers;

    public OfficePlankton(String name, int age, Occupation occupation, Salary salary, int phoneNumbers) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
        this.salary = salary;
        this.phoneNumbers = phoneNumbers;
    }

    public OfficePlankton() {

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Occupation getOccupation() {
        return occupation;
    }

    public Salary getSalary() {
        return salary;
    }

    public int getPhoneNumbers() {
        return phoneNumbers;
    }

    public String getInfo() {
        return "| Имя: " + getName() +
                " | Возраст: " + getAge() +
                " | Род деятельности: " + getOccupation() +
                " | Зарплата: " + getSalary() +
                " | Номер телефона: " + getPhoneNumbers();
    }
}
