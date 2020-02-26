package com.company;

public class Boss extends OfficePlankton {

    public Boss(String name, int age, Occupation occupation, Salary salary, int phoneNumbers) {
        super(name, age, occupation, salary, phoneNumbers);
    }

    public Boss() {
        super();
    }

    public void giveAssignment(String name){
        System.out.println("Указание: " + name + " пусть покупает все акции");
    }

    public void giveAssignment(int phoneNumbers){
        System.out.println("Указание: " + phoneNumbers + "");
    }

    public final void giveAssignment(String name, Salary salary){
        System.out.println("Указание: " + " зарплату: " + name +  " " +salary + " поднять вдвое");
    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }
}
