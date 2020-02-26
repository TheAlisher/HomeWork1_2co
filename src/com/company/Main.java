package com.company;

public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss("Том", 30,
                new Occupation("Следить за покупками акций", "Следить за продажами"),
                Salary.ONE_THOUSAND, 0700501101);
        System.out.println(boss.getInfo());
        boss.giveAssignment("Джон");

        System.out.println("_____________________________________________");

        CompanyDirector companyDirector1 = new CompanyDirector("Райан", 37,
                new Occupation("Следить за рынком покупок", "Следить за рынком продаж"),
                Salary.FIVE_THOUSAND, 0700601101, 34);
        System.out.println(companyDirector1.getInfo());
        companyDirector1.giveAssignment("Тома", Salary.ONE_THOUSAND);

        System.out.println("______________________________________________");

        CompanyDirector companyDirector2 = new CompanyDirector("Хью", 39,
                new Occupation("Следить за поднятием роста акций", "Следить за поднятием роста продаж акций"),
                Salary.SEVEN_THOUSAND, 0700701101, 51);
        System.out.println(companyDirector2.getInfo());
        companyDirector2.giveAssignment(0700101101);


        System.out.println("______________________________________________");


    }
}
