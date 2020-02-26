package com.company;

public final class CompanyDirector extends Boss {

    private int dividends;

    public CompanyDirector(String name, int age, Occupation occupation, Salary salary, int phoneNumbers, int dividends) {
        super(name, age, occupation, salary, phoneNumbers);
        this.dividends = dividends;
    }

    public int getDividends() {
        return dividends;
    }

    @Override
    public void giveAssignment(int phoneNumbers) {
        System.out.println(phoneNumbers + " позвони на этот номер и узнай про акции!");
    }

    @Override
    public String getInfo() {
        return super.getInfo()  + " | Дивиденды: " + dividends;
    }
}
